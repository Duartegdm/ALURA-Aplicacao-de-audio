package test;

import domain.Audio;
import domain.Musica;
import domain.Podcast;

public class Principal{
    public static void main(String[] args) {
        Audio audio = new Audio("music_001281.mp4", 3);
        audio.classificar(10);
        audio.classificar(5);

        Musica tenhaDo = new Musica("Tenha dó", 2, "Los Hermanos", "Los Hermanos");
        tenhaDo.reproduzir();
        tenhaDo.reproduzir();
        tenhaDo.getTotalDeReproducoes();
        tenhaDo.curtir();
        tenhaDo.getCurtidas();
        tenhaDo.classificar(9);
        tenhaDo.classificar(4);
        tenhaDo.getClassificacao();

        Podcast hipsters = new Podcast("Hipsters Podcast", 60, 1);
        hipsters.curtir();
        hipsters.reproduzir();
        hipsters.classificar(9);
        hipsters.reproduzir();
        hipsters.exibirInfo();

    }
}
