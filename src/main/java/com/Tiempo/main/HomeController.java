package com.Tiempo.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/biografia")
    public String biografia() {
        return "biografia";
    }

    @GetMapping("/album")
    public String album() {
        return "album";
    }

    @GetMapping("/cartas")
    public String cartas() {
        return "cartas";
    }

    @GetMapping("/nuestro-mundo")
    public String nuestroMundo() {
        return "nuestro-mundo";
    }

    @GetMapping("/regalos")
    public String regalos() {
        return "regalos";
    }

    @GetMapping("/feliz-cumple")
    public String felizCumple() {
        return "feliz-cumple";
    }
}