package br.com.hcgv.frasesaleatorias.principal;

import br.com.hcgv.frasesaleatorias.model.Corpo;
import br.com.hcgv.frasesaleatorias.repository.Repository;

import java.util.Scanner;

public class Principal {

    private Repository repositorio;
    private Scanner sc = new Scanner(System.in);


    public Principal(Repository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibirMenu() {
        System.out.println("\nDigite o nome do filme:");
        var titulo = sc.nextLine();
        System.out.println("\nDigite a frase:");
        var frase = sc.nextLine();
        System.out.println("\nDigite o personagem que fala:");
        var personagem = sc.nextLine();
        Corpo corpo = new Corpo(titulo, frase, personagem, "https://m.media-amazon.com/images/I/81kdnzGo" +
                "nfL._AC_UL480_FMwebp_QL65_.jpg");
        repositorio.save(corpo);
        System.out.println(corpo);

    }
}
