package com.ruslank.springboot_react_ouath2_app.entities;

import com.ruslank.springboot_react_ouath2_app.utils.EncryptionAlgorithm;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private EncryptionAlgorithm encryptionAlgorithm;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Authority> authorites;
}
