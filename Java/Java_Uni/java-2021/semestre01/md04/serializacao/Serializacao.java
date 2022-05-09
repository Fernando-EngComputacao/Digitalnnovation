package semestre01.md04.serializacao;

import java.io.*;

public class Serializacao {
    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();
    }

    public static void gravadorObjeto() {
        Turma a = new Turma("Eng. de Computação");
        Aluno alu = new Aluno(1, "Fernando", "123");
        alu.setTurma(a);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oos.writeObject(alu);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leitorObjeto() {
        try (ObjectInputStream aux = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno) aux.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
