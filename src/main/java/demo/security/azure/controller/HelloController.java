package demo.security.azure.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/springbootgroup")
    //@PreAuthorize("hasAuthority('springbootgroup')")
    @PreAuthorize("hasRole('springbootgroup')")
    public String springbootgroup() {
        return "Hello Spring Boot Group springbootgroup!";
    }


    @GetMapping("/teste")

    public String teste() {
        return "Hello Spring Boot Group teste!";
    }

}

