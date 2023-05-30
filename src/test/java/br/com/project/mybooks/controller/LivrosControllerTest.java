package br.com.project.mybooks.controller;

import br.com.project.mybooks.dto.RequisicaoCadastroLivro;
import br.com.project.mybooks.model.Livro;
import br.com.project.mybooks.repository.LivroRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.validation.BindingResult;


class LivrosControllerTest {

    private LivrosController controller;
    @Mock
    private LivroRepository repository;

    @Mock
    private RequisicaoCadastroLivro requisicao;

    @Mock
    private BindingResult result;

    @Captor
    private ArgumentCaptor<Livro> captor;

    @BeforeEach
    void beforeEach(){
        MockitoAnnotations.initMocks(this);
        this.controller = new LivrosController(repository);
    }

    @Test
    void deveriaRedirecionarHome(){
        Mockito.when(result.hasErrors()).thenReturn(false);

        String view = controller.novoLivro(requisicao, result);

        Mockito.verify(requisicao).toLivro();
        Mockito.verify(repository).save(Mockito.any());
        Assert.assertEquals("redirect:/home", view);
    }

    @Test
    void deveriaRetornarFormularioSeHouverErro(){
        Mockito.when(result.hasErrors()).thenReturn(true);

        String view = controller.novoLivro(requisicao,result);

        Mockito.verifyNoInteractions(requisicao);
        Mockito.verifyNoInteractions(repository);
        Assert.assertEquals("formulario", view);
    }


}