package pe.edu.tecsup.prj_crud_springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String inicio() {
        return "inicio";
    }

    @GetMapping("/lista")
    public String lista() {
        return "listar";
    }

    @GetMapping("/docente")
    public String docente() {
        return "docente";
    }
}
