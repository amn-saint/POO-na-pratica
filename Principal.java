package br.com.minhasmusicas.principal;

import br.com.minhasmusicas.modelos.MinhasPreferidas;
import br.com.minhasmusicas.modelos.Musica;
import br.com.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Locomotiva do Herobrine");
        musica1.setCantor("Paulin Craft Jogos");

        for (int i = 0; i < 7000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curte();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("PodDrogas");
        podcast1.setHost("Carlin Ruindade Pura");

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast1);
        preferidas.inclui(musica1);
    }
}
