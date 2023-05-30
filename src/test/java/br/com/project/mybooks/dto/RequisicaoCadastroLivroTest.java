package br.com.project.mybooks.dto;

import br.com.project.mybooks.model.Livro;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class RequisicaoCadastroLivroTest {

    private RequisicaoCadastroLivro requisicao;

    @Mock
    private Livro livro;

    @BeforeEach
    void beforeEach(){
        MockitoAnnotations.initMocks(this);
        this.requisicao = new RequisicaoCadastroLivro();
    }

    @Test
    void deveriaConverterRequisicaoParaLivro(){
        Livro livro = requisicao.toLivro();

        Assert.assertEquals(livro.getNomeLivro(), requisicao.getNomeLivro());
        Assert.assertEquals(livro.getAutorLivro(), requisicao.getAutorLivro());

    }

}