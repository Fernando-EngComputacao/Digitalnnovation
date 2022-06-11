 package md03.enc04.va;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("********** VEÍCULO **********");
		Veiculo v = new Veiculo("Gasolina", 40.0, 60.0, 5.0);
		System.out.println(v.toPrint());
		v.dirigir(200.0);
		System.out.println(v.toPrint());
		v.dirigir(20);
		System.out.println(v.toPrint()+"\n");

		
		System.out.println("********** CARRO **********");
		Carro cr = new Carro("Álcool", 40, 60, 5);
		System.out.println(cr.toPrint());
		cr.dirigir(195.4);
		System.out.println(cr.toPrint());
		cr.dirigir(195.4);
		System.out.println(cr.toPrint());
		cr.abastecer("Álcool", 10);
		System.out.println(cr.toPrint());
		cr.abastecer("Gasolina",80);
		System.out.println(cr.toPrint());
		cr.abastecer("Álcool", 10);
		System.out.println(cr.toPrint());
		cr.abastecer("Gasolina",10);
		System.out.println(cr.toPrint()+"\n");
		
		System.out.println("********** CARRO **********");
		Carro carroA = new Carro("Flex", 40, 80, 1);
		System.out.println(carroA.toPrint());
		carroA.dirigir(20);
		System.out.println(carroA.toPrint());
		carroA.dirigir(20);
		System.out.println(carroA.toPrint());
		carroA.abastecer("Álcool", 5);
		System.out.println(carroA.toPrint());
		carroA.abastecer("Gasolina", 5);
		System.out.println(carroA.toPrint());
		carroA.abastecer("Diesel", 2);
		System.out.println(carroA.toPrint());
		carroA.abastecer("Álcool", 5);
		System.out.println(carroA.toPrint());
		carroA.abastecer("Gasolina", 5);
		System.out.println(carroA.toPrint()+"\n");
		
		
		System.out.println("********** CAMINHÃO **********");
		Caminhao ch = new Caminhao(40, 60, 5);
		System.out.println(ch.toPrint());
		ch.dirigir(189);
		System.out.println(ch.toPrint());
		ch.dirigir(50);
		System.out.println(ch.toPrint());
		ch.abastecer("Diesel", 10);
		System.out.println(ch.toPrint());
		ch.abastecer("Gasolina",80);
		System.out.println(ch.toPrint());
		ch.abastecer("Diesel", -10);
		System.out.println(ch.toPrint());
		ch.abastecer("Gasolina", -10);
		System.out.println(ch.toPrint());
	}
}
