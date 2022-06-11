package semestre01.md05.ava;

public class Defeito {
    private String data;
    private String descricao;

    // Constructor
    public Defeito(String data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }
    public Defeito(){}

    // toString

    @Override
    public String toString() {
        return "Defeito{" +
                "data='" + data + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
