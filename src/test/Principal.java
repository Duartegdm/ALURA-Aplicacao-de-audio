package test;

import domain.Audio;
import domain.Musica;
import domain.Podcast;

public class Principal{
    public static void main(String[] args) {
        Audio audio = new Audio("music_001281.mp4", 3);
        audio.classificar(10);
        audio.classificar(5);
        audio.reproduzir();
        audio.curtir();
        audio.exibirInfo();

        Musica tenhaDo = new Musica("Tenha dó", 2, "Los Hermanos", "Los Hermanos");
        tenhaDo.reproduzir();
        tenhaDo.reproduzir();
        tenhaDo.curtir();
        tenhaDo.classificar(9);
        tenhaDo.classificar(4);
        tenhaDo.exibirInfo();

        Podcast hipsters = new Podcast("Hipsters Podcast", 119, 1);
        hipsters.curtir();
        hipsters.reproduzir();
        hipsters.classificar(9);
        hipsters.reproduzir();
        hipsters.exibirInfo();

    }
}
