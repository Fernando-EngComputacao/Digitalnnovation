package semestre01.md05.usandoMap.exemploMap;

import java.util.Objects;

public class Consumidor {
    private String nome;
    private String cpf;

    // Constructor
    public Consumidor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return Objects.equals(cpf, that.cpf);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    // toString
    @Override
    public String toString() {
        return "Consumidor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
