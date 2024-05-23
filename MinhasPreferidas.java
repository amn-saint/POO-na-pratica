package br.com.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui (Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " É considerado um dos melhores dentre os usuarios");
        } else {
            System.out.println(audio.getTitulo() + " Mediano dentre as analises dos usuários");
        }

    }
}
