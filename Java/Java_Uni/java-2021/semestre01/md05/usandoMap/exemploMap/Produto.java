package semestre01.md05.usandoMap.exemploMap;

public class Produto {
    private String nome;
    private Double valor;

    //Construtor
    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    public Produto(){}

    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    //toString

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
