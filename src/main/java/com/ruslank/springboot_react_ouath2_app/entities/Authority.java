package com.ruslank.springboot_react_ouath2_app.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "authority")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @JoinColumn(name = "user")
    @ManyToOne
    private User user;

}
