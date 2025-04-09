package org.lesson.java.thymeleaf.best_of_the_year.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

// con questa annotazione setto questo file come un controller
@Controller
// Indica che tutte le rotte (URL) gestite da questo controller iniziano con /
@RequestMapping("/")
public class HomeController {

    // creo il path che collega il file home.html a questo controller
    @GetMapping("/")
    public String home() {
        return "home";
    }
    
    
}
