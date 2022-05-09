package semestre01.md04.classeFileParaArquivos.BufferedWriterReader;

import java.io.*;

public class BufferedWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("BufferedWriterReader.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))) {

            bw.write("BufferedWriter aqui usado.");
            bw.newLine(); //Pula linha
            bw.write("Fernando Furtado.");
            bw.flush();

            //Ler
            String s = null;

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // OU

        /*
        File file = new File("BufferedWriterReader.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("BufferedWriter aqui usado.Fernando Furtado.");
            bw.newLine(); //Pula linha
            bw.write("Fernando Furtado.");
            bw.flush();
            bw.close();

            //Ler
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s = null;

            while ((s=br.readLine()) != null){
                System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
    }
}
