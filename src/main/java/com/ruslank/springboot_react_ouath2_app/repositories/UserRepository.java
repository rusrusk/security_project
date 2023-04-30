package com.ruslank.springboot_react_ouath2_app.repositories;

import com.ruslank.springboot_react_ouath2_app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}
