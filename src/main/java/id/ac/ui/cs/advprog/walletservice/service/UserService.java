package id.ac.ui.cs.advprog.walletservice.service;

import id.ac.ui.cs.advprog.walletservice.model.User;
import id.ac.ui.cs.advprog.walletservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(String name) {
        User user = new User(name);
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
