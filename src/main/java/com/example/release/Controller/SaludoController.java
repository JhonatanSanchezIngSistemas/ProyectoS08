package com.example.release.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class SaludoController {
    @GetMapping("/Saludo")
    public String Saludo() {
        return "Aqui desde pushh request";
    }
       
}
