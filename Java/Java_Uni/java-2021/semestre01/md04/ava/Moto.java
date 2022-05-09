package semestre01.md04.ava;

public class Moto extends Veiculo{

    @Override
    public void acelerar() {
        System.out.println("Moto a acelerar!");
    }
    @Override
    public void frear() {
        System.out.println("Moto a frear!");
    }
}
