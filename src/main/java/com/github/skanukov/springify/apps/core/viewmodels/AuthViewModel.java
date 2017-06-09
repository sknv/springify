package com.github.skanukov.springify.apps.core.viewmodels;

import org.springframework.security.core.Authentication;

public class AuthViewModel {

    public static final String REQUEST_AUTH_ATTR = "auth";

    public boolean isSignedIn;
    public Authentication user;
}
