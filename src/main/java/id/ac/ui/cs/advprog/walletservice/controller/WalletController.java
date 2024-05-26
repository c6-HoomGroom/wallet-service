package id.ac.ui.cs.advprog.walletservice.controller;

import id.ac.ui.cs.advprog.walletservice.model.User;
import id.ac.ui.cs.advprog.walletservice.model.Wallet;
import id.ac.ui.cs.advprog.walletservice.service.UserService;
import id.ac.ui.cs.advprog.walletservice.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class WalletController {

    @Autowired
    private UserService userService;

    @Autowired
    private WalletService walletService;

    @PostMapping("/create")
    public User createUser(@RequestParam String name) {
        return userService.createUser(name);
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/{id}/top-up")
    public User topUpBalance(@PathVariable Long id, @RequestParam Double amount) {
        Optional<User> optionalUser = userService.getUserById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            Wallet wallet = walletService.topUpBalance(user.getWallet(), amount);
            user.setWallet(wallet);
            return userService.createUser(user.getFullName());
        }
        throw new RuntimeException("User not found");
    }
}