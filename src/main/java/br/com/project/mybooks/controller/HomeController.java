package br.com.project.mybooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/aplicacao")
    public String aplicacaoRodando(Model model) {
        model.addAttribute("aplicacaoNome", "MyBooks");

        return "home";
    }
}


