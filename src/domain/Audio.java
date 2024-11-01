package domain;

public class Audio {
    protected String titulo;
    protected int duracao;
    protected int totalDeReproducoes;
    protected int curtidas;
    protected int classificacao;
    protected int notaTotal;
    protected int totalDeClassificacoes;

    public Audio(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void exibirInfo() {
        System.out.println("---Arquivo de áudio---");
        System.out.println("Nome: "+this.titulo);
        System.out.printf("Duração: %dmin%n", this.duracao);
        System.out.println("Total de Reproduções: "+this.duracao);
        System.out.println("Curtidas: "+this.curtidas);
        System.out.println("Classificação: "+this.classificacao);
        System.out.println("----------------------");
    }

    public void curtir() {
        System.out.printf("%s adicionado aos curtidos%n", this.titulo);
        this.curtidas++;
    }

    public void reproduzir() {
        System.out.printf("Reproduzindo '%s'%n", this.titulo);
        this.totalDeReproducoes++;
    }

    public void classificar(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.totalDeClassificacoes++;
            System.out.printf("Você classificou '%s' com a nota: %d%n", this.titulo, nota);
            this.notaTotal += nota;
            classificacao = this.notaTotal / this.totalDeClassificacoes;
        } else {
            System.out.println("A nota deve estar entre 0 a 10");
        }
    }

    public int getTotalDeReproducoes() {
        return this.totalDeReproducoes;
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public String getTitulo() {
        return titulo;
    }


    public int getDuracao() {
        return duracao;
    }

}
