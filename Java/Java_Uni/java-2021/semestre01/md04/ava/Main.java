package semestre01.md04.ava;

public class Main {
    public static void main(String[] args) {
        // Objeto Estacionamento
        Estacionamento estacionados = new Estacionamento();

        // Objetos Moto
        Moto m = new Moto();
        Moto m2 = new Moto();
        Moto m3 = new Moto();

        // Objetos Carro
        Carro c = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();

        // Adicionando lista de carros no estacionamento
        estacionados.getCarro().add(c);
        estacionados.getCarro().add(c2);
        estacionados.getCarro().add(c3);

        // Adicionando lista de motos no estacionamento
        estacionados.getMoto().add(m);
        estacionados.getMoto().add(m2);
        estacionados.getMoto().add(m3);

        // Grava os dados
        estacionados.gravar(estacionados);

        // Lê os dados e apresenta na Tela
        Estacionamento arquivoLido = (Estacionamento) estacionados.ler();

        //Leitura da Serialização na íntegra de acordo com o toString
        System.out.println("Leitura do arquivo serializado! \nLista de Carros e Motos: "+arquivoLido.toString());
//        arquivoLido.getMoto();
//        arquivoLido.getCarro();
//        arquivoLido.getMoto().get(0).acelerar();


        // Apresentando as Motos de suas funções
        System.out.println("--- Motos no Estacionamento ---");
        for (int x = 0; x < arquivoLido.getMoto().size(); x++){
            System.out.print("**Moto N° " + (x + 1) + "**\n");
            arquivoLido.getMoto().get(x).acelerar();
            arquivoLido.getMoto().get(x).frear();
            System.out.println("");
        }

        // Apresentando os Carros de suas funções
        System.out.println("--- Carros no Estacionamento ---");
        for (int x = 0; x < arquivoLido.getCarro().size(); x++){
            System.out.print("**Carro N° " + (x + 1) + "**\n");
            arquivoLido.getCarro().get(x).acelerar();
            arquivoLido.getCarro().get(x).frear();
            System.out.println("");
        }
    }
}
