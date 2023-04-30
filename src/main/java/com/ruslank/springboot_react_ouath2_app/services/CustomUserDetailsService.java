package com.ruslank.springboot_react_ouath2_app.services;

import com.ruslank.springboot_react_ouath2_app.entities.User;
import com.ruslank.springboot_react_ouath2_app.implementations.CustomUserDetails;
import com.ruslank.springboot_react_ouath2_app.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Supplier;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Supplier<UsernameNotFoundException> supplier =
                () -> new UsernameNotFoundException("authentication issue!");
        Optional<User> user = this.userRepository.findByUsername(username);
        return user.map(CustomUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("username was not found"));
    }
}
