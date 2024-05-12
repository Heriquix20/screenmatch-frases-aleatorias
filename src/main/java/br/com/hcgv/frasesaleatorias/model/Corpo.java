package br.com.hcgv.frasesaleatorias.model;

import jakarta.persistence.*;

@Entity
@Table(name = "corpoFrases")
public class Corpo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public Corpo() {
    }

    public Corpo(String titulo, String frase, String personagem, String poster) {
        this.titulo = titulo;
        this.frase = frase;
        this.personagem = personagem;
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "Corpo{" +
                "titulo='" + titulo + '\'' +
                ", frase='" + frase + '\'' +
                ", Personagem='" + personagem + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}
