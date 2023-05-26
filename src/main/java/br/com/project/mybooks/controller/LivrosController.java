package br.com.project.mybooks.controller;


import br.com.project.mybooks.dto.RequisicaoCadastroLivro;
import br.com.project.mybooks.model.Livro;
import br.com.project.mybooks.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livros")
public class LivrosController {

    @Autowired
    private LivroRepository repository;

    @GetMapping("/cadastro")
    public String formulario() {
        return "formulario";
    }

    @PostMapping("/novo")
    public String novoLivro(RequisicaoCadastroLivro requisicao) {
        Livro livro = requisicao.toPedido();
        repository.save(livro);

        return "formulario";
    }
}
