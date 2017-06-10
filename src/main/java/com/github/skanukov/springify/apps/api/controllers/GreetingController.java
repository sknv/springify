package com.github.skanukov.springify.apps.api.controllers;

import com.github.skanukov.springify.apps.api.config.router.ApiRouterConfig;
import com.github.skanukov.springify.core.facades.AuthFacade;
import com.github.skanukov.springify.lib.models.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(ApiRouterConfig.API_BASE_URI + "/greeting")
public class GreetingController {

    private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);
    private static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();
    private final AuthFacade authFacade;

    @Autowired
    public GreetingController(AuthFacade authFacade) {
        this.authFacade = authFacade;
    }

    @GetMapping("/greet")
    public Greeting greet(@RequestParam(value = "name", defaultValue = "World") String name) {
        if (authFacade.isAuthenticated()) {
            logger.info("Greet is accessed by {}", authFacade.getAuthentication().getName());
        }

        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
