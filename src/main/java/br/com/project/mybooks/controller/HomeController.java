package br.com.project.mybooks.controller;

import br.com.project.mybooks.model.Livro;
import br.com.project.mybooks.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private LivroRepository repository;

    @GetMapping
    public String home(Model model) {
        List<Livro> livros = repository.findAll();
        model.addAttribute("livros", livros);

        return "home";
    }
}


