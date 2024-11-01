package domain;

public class Podcast extends Audio {
    private int episodio;

    public Podcast(String titulo, int duracao, int episodio) {
        super(titulo, duracao);
        this.episodio = episodio;
    }

    @Override
    public void exibirInfo() {
        System.out.println("-----Podcast-----");
        System.out.println("Nome: " + this.titulo);
        System.out.println("Episódio: " + this.episodio);
        if (this.duracao >= 60) {
            System.out.printf("Duração: %dh+%n", (this.duracao / 60));
        } else{
            System.out.printf("Duração: %dmin%n", this.duracao);
        }
        System.out.println("Total de Reproduções: " + this.totalDeReproducoes);
        System.out.println("Curtidas: " + this.curtidas);
        System.out.println("Classificação: " + this.classificacao);
        System.out.println("-----------------");
    }

    @Override
    public void reproduzir() {
        System.out.printf("Reproduzindo '%s #%d'%n", this.titulo, this.episodio);
        this.totalDeReproducoes++;
    }

    @Override
    public void curtir() {
        System.out.printf("'%s #%d' adicionado aos podcasts curtidos%n", this.getTitulo(), this.episodio);
        this.curtidas++;
    }

    @Override
    public void classificar(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.totalDeClassificacoes++;
            System.out.printf("Você classificou '%s #%d' com a nota: %d%n", this.titulo, this.episodio, nota);            this.notaTotal += nota;
            classificacao = this.notaTotal / this.totalDeClassificacoes;
        } else {
            System.out.println("A nota deve estar entre 0 a 10");
        }
    }
}
