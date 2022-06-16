package org.example.Task3.config;

import org.example.Task3.model.Island2;
import org.example.Task3.model.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.Task3")
public class MyConfig {
    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
}
