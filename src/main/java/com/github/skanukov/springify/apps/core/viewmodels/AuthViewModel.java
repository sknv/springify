package com.github.skanukov.springify.apps.core.viewmodels;

import org.springframework.security.core.Authentication;

public class AuthViewModel {
    public boolean isSignedIn;
    public Authentication user;
}
