package com.github.skanukov.springify.apps.web.viewmodels;

import org.springframework.security.core.Authentication;

public final class AuthViewModel {

    public static final String REQUEST_AUTH_ATTR = "auth";

    public boolean isSignedIn;
    public Authentication user;
}
