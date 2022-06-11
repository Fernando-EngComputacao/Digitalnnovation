package semestre01.md04.classeFileParaArquivos.File;
import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args){
        File file = new File("Arquivo.txt");

        try {
            System.out.println(file.createNewFile());
            boolean exists = file.exists();
            // Permissão de Leitura?
            System.out.println("É possíel ler?: " + file.canRead());

            // Permissão de Leitura?
            System.out.println("É possíel escrever?: " + file.canWrite());

            // Caminho do arquivo
            System.out.println("Qual o caminho do arquivo?: "+ file.getPath());

            // Caminho completo do arquivo
            System.out.println("Qual o caminho completo do arquivo?: "+ file.getAbsolutePath());

            // Diretório onde está o arquivo
            System.out.println("Diretório onde está o arquivo?: " + file.isDirectory());

            // Última modificação
            System.out.println("Última modificação?: " + (file.lastModified()));

            if (exists){
                System.out.println("Deletado: "+file.delete());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
