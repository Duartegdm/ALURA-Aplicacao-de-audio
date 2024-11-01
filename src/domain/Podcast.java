package domain;

public class Podcast extends Audio{
    private int episodio;

    public Podcast(String titulo, int duracao, int episodio) {
        super(titulo, duracao);
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
        super.curtir();
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
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public int getDuracao() {
        return super.getDuracao();
    }

}
