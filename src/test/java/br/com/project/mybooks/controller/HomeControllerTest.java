package br.com.project.mybooks.controller;

import br.com.project.mybooks.model.Livro;
import br.com.project.mybooks.repository.LivroRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {

    private HomeController controller;

    @Mock
    private LivroRepository repository;

    @Mock
    private Model model;

    @BeforeEach
    void beforeEach(){
        MockitoAnnotations.initMocks(this);
        this.controller = new HomeController(repository);
    }

    @Test
    void deveriaRetornarHome(){
        List<Livro> livros = new ArrayList<Livro>();
        livros.add(new Livro());
        livros.add(new Livro());
        Mockito.when(repository.findAll()).thenReturn(livros);

        Model model = new ConcurrentModel();

        String view = controller.home(model);

        Assert.assertEquals("home", view);
        List<Livro> result = (List<Livro>) model.getAttribute("livros");

        Assert.assertEquals(result.size(), 2);

    }

}