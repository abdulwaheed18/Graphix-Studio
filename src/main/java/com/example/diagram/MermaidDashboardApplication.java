package com.example.diagram;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot application class.
 * This class initializes and runs the Spring Boot application.
 * The @SpringBootApplication annotation is a convenience annotation that adds all of the following:
 * - @Configuration: Tags the class as a source of bean definitions for the application context.
 * - @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
 * - @ComponentScan: Tells Spring to look for other components, configurations, and services in the 'com/example/mermaiddashboard' package, allowing it to find controllers.
 */
@SpringBootApplication
public class MermaidDashboardApplication {

    /**
     * The main method, which serves as the entry point for the Spring Boot application.
     * It delegates to Spring Boot's SpringApplication class by calling run.
     * @param args Command line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(MermaidDashboardApplication.class, args);
    }

}
