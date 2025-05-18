package com.example.diagram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Spring MVC Controller to handle requests for the dashboard.
 * The @Controller annotation indicates that this class serves the role of a controller.
 * Spring MVC will scan for classes annotated with @Controller to map web requests to specific handler methods.
 */
@Controller
public class DashboardController {

    /**
     * Handles GET requests to the root path ("/").
     * The @GetMapping("/") annotation maps HTTP GET requests for the root URL path to this method.
     * This method returns the string "index", which is the logical name of the view to be rendered.
     * Spring Boot, with Thymeleaf configured, will look for an HTML template named "index.html"
     * in the "src/main/resources/templates/" directory.
     * @return The name of the Thymeleaf template to render (index).
     */
    @GetMapping("/")
    public String index() {
        return "index"; // This resolves to src/main/resources/templates/index.html
    }
}
