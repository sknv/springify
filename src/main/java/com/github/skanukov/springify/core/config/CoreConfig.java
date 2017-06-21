package com.github.skanukov.springify.core.config;

import com.github.skanukov.springify.core.interceptors.RequestProcessingTimeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CoreConfig extends WebMvcConfigurerAdapter {

    private final RequestProcessingTimeInterceptor requestProcessingTimeInterceptor;

    @Autowired
    public CoreConfig(RequestProcessingTimeInterceptor requestProcessingTimeInterceptor) {
        this.requestProcessingTimeInterceptor = requestProcessingTimeInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // Do not intercept api requests.
        registry.addInterceptor(requestProcessingTimeInterceptor);
    }
}
