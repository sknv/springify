package com.github.skanukov.springify.apps.web.config;

import com.mitchellbosecke.pebble.loader.FileLoader;
import com.mitchellbosecke.pebble.loader.Loader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * PebbleConfig sets FileLoader as the default loader.
 */
@Configuration
public class PebbleConfig {

    @Bean
    public Loader<?> pebbleLoader() {
        return new FileLoader();
    }
}
