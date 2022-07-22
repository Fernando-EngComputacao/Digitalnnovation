package code.font.model;

public abstract class Conteudo {
    protected static final double xp_padrao = 10;
    private String titulo;
    private String descricao;

    //Constructor
    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }
    public Conteudo() {}


    //Methods
    public abstract double calcularXp();

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
