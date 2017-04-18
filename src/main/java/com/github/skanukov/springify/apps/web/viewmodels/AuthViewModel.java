package com.github.skanukov.springify.apps.web.viewmodels;

import org.springframework.security.core.Authentication;

public class AuthViewModel {
    public boolean isSignedIn;
    public Authentication user;
}
