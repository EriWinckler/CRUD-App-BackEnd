package com.project.crud.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Define user authorities (e.g., roles, permissions)
        return Collections.emptyList();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Modify if account expiration is required
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Modify if account locking is required
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Modify if credential expiration is required
    }

    @Override
    public boolean isEnabled() {
        return true; // Modify if user enabling/disabling is required
    }
}
