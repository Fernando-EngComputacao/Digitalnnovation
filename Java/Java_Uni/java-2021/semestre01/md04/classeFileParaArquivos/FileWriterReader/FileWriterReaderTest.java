package semestre01.md04.classeFileParaArquivos.FileWriterReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try (FileWriter fw = new FileWriter(file); // Chama Método para Escrever
             FileReader fr = new FileReader(file)) { // Chama Método para Ler

            // Escrever
            fw.write("\nMy first message!\nFernando Furtado.");
            fw.flush();

            // Ler
            char[] in = new char[36];
            int size = fr.read(in);
            System.out.println("Tamanho arquivo: " + size);
            for (char x : in) {
                System.out.print(x);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        OU
        try {
            // Escrever
            FileWriter fw = new FileWriter(file);
            fw.write("\nMy first message!\nFernando Furtado.");
            fw.flush();
            fw.close();

            // Ler
            FileReader fr = new FileReader(file);
            char[] in = new char[36];
            int size = fr.read(in);
            System.out.println("Tamanho arquivo: "+ size);
            for (char x: in){
                System.out.print(x);
            }
            fr.close();
        } catch (IOException e){
            e.printStackTrace();
        }
         */
    }
}
