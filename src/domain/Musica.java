package domain;

public class Musica extends Audio {
    private String album;
    private String artista;

    public Musica(String titulo, int duracao, String album, String artista) {
        super(titulo, duracao);
        this.album = album;
        this.artista = artista;
    }

    @Override
    public void exibirInfo() {
        System.out.println("-----Música-----");
        System.out.println("Nome: " + this.titulo);
        System.out.printf("Duração: %dmin%n", this.duracao);
        System.out.println("Total de Reproduções: " + this.duracao);
        System.out.println("Curtidas: " + this.curtidas);
        System.out.println("Classificação: " + this.classificacao);
        System.out.println("----------------");
    }

    @Override
    public void curtir() {
        System.out.printf("'%s' de '%s' adicionado aos curtidos%n", this.getTitulo(), this.artista);
        this.curtidas++;
    }

}
