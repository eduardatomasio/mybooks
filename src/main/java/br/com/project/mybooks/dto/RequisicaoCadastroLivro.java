package br.com.project.mybooks.dto;

import br.com.project.mybooks.model.Livro;
import br.com.project.mybooks.model.Status;

public class RequisicaoCadastroLivro {
    private String nomeLivro;
    private String autorLivro;
    private String urlLivro;
    private String sinopse;
    private String status;

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getUrlLivro() {
        return urlLivro;
    }

    public void setUrlLivro(String urlLivro) {
        this.urlLivro = urlLivro;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Livro toPedido() {
        Livro livro = new Livro();
        livro.setNomeLivro(nomeLivro);
        livro.setAutorLivro(autorLivro);
        livro.setUrlImagemLivro(urlLivro);
        livro.setSinopse(sinopse);
        livro.setStatusLeitura(Status.valueOf(status));
        return livro;
    }
}
