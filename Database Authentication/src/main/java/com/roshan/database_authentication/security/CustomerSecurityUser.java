package com.roshan.database_authentication.security;

import com.roshan.database_authentication.models.User;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomerSecurityUser extends User implements UserDetails {

    public CustomerSecurityUser() {
    }

    public CustomerSecurityUser(User user) {
        this.setAuthorities(user.getAuthorities());
        this.setId(user.getId());
        this.setUsername(user.getUsername());
        this.setPassword(user.getPassword());
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
