package com.github.skanukov.springify.apps.core.facades;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthFacade {

    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public boolean isAuthenticated() {
        Authentication auth = getAuthentication();
        return !(auth instanceof AnonymousAuthenticationToken);
    }
}
