package com.github.skanukov.springify.apps.web.config;

import com.github.skanukov.springify.apps.core.interceptors.AuthModelViewInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    private final AuthModelViewInterceptor authModelViewInterceptor;

    @Autowired
    public WebConfig(AuthModelViewInterceptor authModelViewInterceptor) {
        this.authModelViewInterceptor = authModelViewInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authModelViewInterceptor);
    }
}
