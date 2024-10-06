package br.com.alura.screenmatch.principais;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("Matrix",1985);
        favorito.avalia(10);

        Filme outroFilme = new Filme("Bella e a Fera",1950);
        outroFilme.avalia(8);

        Serie serie = new Serie("La casa de Papel",2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outroFilme);
        lista.add(serie);

        for (Titulo item : lista) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao()>2){
                System.out.println(filme);
            }

        }


    }
}
