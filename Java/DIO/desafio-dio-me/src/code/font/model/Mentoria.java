package code.font.model;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    //Constructors
    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }
    public Mentoria(){}

    //Methods
    @Override
    public double calcularXp() {
        return xp_padrao * 20d;
    }

    //Getters and Setters
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    //toString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
