package semestre01.md04.ava;

public class Carro extends Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Carro a acelerar");
    }
    @Override
    public void frear() {
        System.out.println("Carro a frear!");
    }
}
