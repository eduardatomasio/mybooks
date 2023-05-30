package br.com.project.mybooks.controller;


import br.com.project.mybooks.dto.RequisicaoCadastroLivro;
import br.com.project.mybooks.model.Livro;
import br.com.project.mybooks.repository.LivroRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livros")
public class LivrosController {

    @Autowired
    private LivroRepository repository;

    @GetMapping("/cadastro")
    public String formulario(RequisicaoCadastroLivro requisicao) {
        return "formulario";
    }

    @PostMapping("/novo")
    public String novoLivro(@Valid RequisicaoCadastroLivro requisicao, BindingResult result) {
        if(result.hasErrors()){
            return "formulario";
        }
        Livro livro = requisicao.toLivro();
        repository.save(livro);

        return "redirect:/home";
    }
}
