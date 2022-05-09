package semestre01.md04.serializacao;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {
   private Integer id;
   private String name;
   private String password;
   private static String schoolName = "IF Goiano";
   private transient Turma turma;

   // Constructor
    public Aluno(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public static String getSchoolName() {
        return schoolName;
    }
    public static void setSchoolName(String schoolName) {
        Aluno.schoolName = schoolName;
    }
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    //toString
    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", schoolName='" + schoolName +
                ", Turma='" + turma +
                '}';
    }

    private void writeObject(ObjectOutputStream a) {
        try {
            a.defaultWriteObject();
            a.writeUTF(turma.getName());
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream a){
        try {
            a.defaultReadObject();
            turma = new Turma(a.readUTF());
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
