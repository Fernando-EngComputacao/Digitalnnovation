package semestre01.md04.serializacao;

import java.io.Serializable;

public class Turma {
    private String name;

    // Constructor
    public Turma(String name) {
        this.name = name;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //toString
    @Override
    public String toString() {
        return "Turma{" +
                "name='" + name + '\'' +
                '}';
    }
}
