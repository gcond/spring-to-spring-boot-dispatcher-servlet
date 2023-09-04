package com.dragonflydev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Spring JAX-RS to Spring Boot!
 *
 */
@SpringBootApplication
@ImportResource("classpath:motto.xml")
public class JaxRsApp {
    public static void main( String[] args ) {
        SpringApplication.run(JaxRsApp.class, args);
    }
}
