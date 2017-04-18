package com.github.skanukov.springify.apps.web.controllers.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {

    private static final Logger logger = LoggerFactory.getLogger(SessionController.class);

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        logger.info("Login page requested");

        if (error != null) {
            logger.info("Error is: {}", error);
            model.addAttribute("error", "Your username or password are invalid.");
        }

        if (logout != null) {
            model.addAttribute("logout", "You have been logged out successfully.");
        }

        return "session/login";
    }
}
