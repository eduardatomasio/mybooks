package br.com.project.mybooks.dto;

import br.com.project.mybooks.model.Livro;
import jakarta.validation.constraints.NotBlank;

public class RequisicaoCadastroLivro {

    @NotBlank
    private String nomeLivro;

    @NotBlank
    private String autorLivro;

    @NotBlank
    private String urlLivro;

    @NotBlank
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

    public Livro toLivro() {
        Livro livro = new Livro();
        livro.setNomeLivro(nomeLivro);
        livro.setAutorLivro(autorLivro);
        livro.setUrlImagemLivro(urlLivro);
        livro.setSinopse(sinopse);
        livro.setStatusLeitura(status);

        return livro;
    }

}
