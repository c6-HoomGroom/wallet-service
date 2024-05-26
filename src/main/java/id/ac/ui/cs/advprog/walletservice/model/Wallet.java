package id.ac.ui.cs.advprog.walletservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Setter;
import lombok.Getter;

@Getter@Setter@Entity
public class Wallet {

    @Id
    private Long id;

    private Double balance;


}
