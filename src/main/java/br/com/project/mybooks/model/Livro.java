package br.com.project.mybooks.model;

import jakarta.persistence.*;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String urlImagemLivro;

    private String nomeLivro;

    private String autorLivro;

    @Column(length = 800)
    private String sinopse;

    @Enumerated(EnumType.STRING)
    private Status statusLeitura;

    public Livro() {
    }

    public Livro(Long id, String urlImagemLivro, String nomeLivro, String autorLivro, String sinopse, Status statusLeitura) {
        this.urlImagemLivro = urlImagemLivro;
        this.id = id;
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.sinopse = sinopse;
        this.statusLeitura = statusLeitura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlImagemLivro() {
        return urlImagemLivro;
    }

    public void setUrlImagemLivro(String urlImagemLivro) {
        this.urlImagemLivro = urlImagemLivro;
    }

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

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Status getStatusLeitura() {
        return statusLeitura;
    }

    public void setStatusLeitura(Status statusLeitura) {
        this.statusLeitura = statusLeitura;
    }
}