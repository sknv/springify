package com.github.skanukov.springify.apps.web.controllers;

import com.github.skanukov.springify.apps.web.config.WebRouterConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(WebRouterConfig.WEB_BASE_URI + "/")
public class PageController {

    private static final Logger logger = LoggerFactory.getLogger(PageController.class);

    @GetMapping("/")
    public String index(Model model) {
        logger.info("Index page requested");

        model.addAttribute("name", "Springify");
        return "page/index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        logger.info("About page requested");

        return "page/about";
    }
}
