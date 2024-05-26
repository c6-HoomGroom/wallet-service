package id.ac.ui.cs.advprog.walletservice.repository;

import id.ac.ui.cs.advprog.walletservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}