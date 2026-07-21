package com.Tiempo.main.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // Mapeo de TODAS tus vistas HTML
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/biografia").setViewName("biografia");
        registry.addViewController("/album").setViewName("album");
        registry.addViewController("/cartas").setViewName("cartas");
        registry.addViewController("/nuestro-mundo").setViewName("nuestro-mundo");
        registry.addViewController("/regalos").setViewName("regalos");
        registry.addViewController("/feliz-cumple").setViewName("feliz-cumple");
        registry.addViewController("/futuro").setViewName("futuro");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Asegura que las imágenes, CSS y MÚSICA se sirvan sin problemas
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }
}