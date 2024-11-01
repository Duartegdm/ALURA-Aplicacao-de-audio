package domain;

public class Musica extends Audio{
    private String album;
    private String artista;

    public Musica(String titulo, int duracao, String album, String artista) {
        super(titulo, duracao);
        this.album = album;
        this.artista = artista;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
    }

    @Override
    public int getTotalDeReproducoes() {
        return super.getTotalDeReproducoes();
    }

    @Override
    public void curtir() {
        System.out.printf("'%s' de '%s' adicionado aos curtidos%n", this.getTitulo(), this.artista);
        curtidas += 1;
    }

    @Override
    public int getCurtidas() {
        return super.getCurtidas();
    }

    @Override
    public void classificar(int nota) {
        super.classificar(nota);
    }

    @Override
    public int getClassificacao() {
        return super.getClassificacao();
    }

    @Override
    public int getDuracao() {
        return super.getDuracao();
    }
}
