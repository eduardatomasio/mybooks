package br.com.project.mybooks.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livros")
public class LivrosController {

    @GetMapping("/cadastro")
    public String formulario() {
        return "formulario";
    }
}
