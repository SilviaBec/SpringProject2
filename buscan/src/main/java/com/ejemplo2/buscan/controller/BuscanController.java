package com.ejemplo2.buscan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BuscanController {

    @GetMapping("/servicios")
    public String goToServicios(Model model){
        model.addAttribute("name", "Bienvenid@ a mi pagina");
        return "servicios";
    }

    @GetMapping("/contacto")
    public String goToContacto(Model model){
        return "contacto";
    }

    @GetMapping("/inicioSesion")
    public String goToInicioSesion(Model model){
        return "inicioSesion";
    }
    
    
}
