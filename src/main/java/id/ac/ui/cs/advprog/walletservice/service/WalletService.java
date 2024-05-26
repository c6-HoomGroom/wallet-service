package id.ac.ui.cs.advprog.walletservice.service;

import id.ac.ui.cs.advprog.walletservice.model.Wallet;
import id.ac.ui.cs.advprog.walletservice.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WalletService {

    @Autowired
    private WalletRepository walletRepository;

    public Wallet topUpBalance(Wallet wallet, Double amount) {
        wallet.setBalance(wallet.getBalance() + amount);
        return walletRepository.save(wallet);
    }

    public Optional<Wallet> getWalletById(Long id) {
        return walletRepository.findById(id);
    }
}
