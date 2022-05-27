package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController @Slf4j
    public class ControladorInicio {

        @GetMapping("/")
        public String inicio(){
            log.info("Ejecutando el controlador Rest");
            log.debug("Mas detalle del controlador");
            return "Hola Mundo con Spring Boot";
        }

    }
