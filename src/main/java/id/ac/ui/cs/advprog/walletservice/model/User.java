package id.ac.ui.cs.advprog.walletservice.model;

import id.ac.ui.cs.advprog.walletservice.model.Wallet;
import java.util.Date;

import jakarta.persistence.Id;
import lombok.Setter;
import lombok.Getter;

@Setter@Getter
public class User {
    @Id
    private Long id;

    private String fullName;
    private Date birthDate;
    private String gender;
    private String username;
    private String email;
    private String password;
    private Wallet wallet;



}
