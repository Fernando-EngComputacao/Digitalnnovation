package md04.enc08.avaliacao;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ListGenerator one = new ListGenerator(1, 10, 8);
		ListGenerator two = new ListGenerator(0,20,8);
		ArrayList<Integer> listOne = one.generate();
		ArrayList<Integer> listTwo = two.generatePack(new int[] {0,1,2,3,4,5,10,15,18,17,20});
	
		Probability pOne = new Probability();
		System.out.println("--- LISTAS ---");
		pOne.toPrint(listOne); 
		pOne.toPrint(listTwo);
		
		System.out.println("\n--- UNION ---");
		System.out.println("De "+listOne.toString()+" e "+listTwo.toString());
		System.out.println(pOne.union(listOne, listTwo));
		
		System.out.println("\n--- INTERSECTION ---");
		System.out.println("De "+listOne.toString()+" e "+listTwo.toString());
		System.out.println(pOne.intersection(listOne, listTwo));
		
		System.out.println("\n--- VALUE PROBABILITY ---");
		System.out.println("Da lista "+listOne.toString()+" e n° 5");
		System.out.println(pOne.valueProbability(listOne, 5));
		
		System.out.println("\n--- TOTAL PROBABILITY ---");
		System.out.println("Da lista "+listOne.toString());
		System.out.println(pOne.totalProbability(listOne));
		
		System.out.println("\n--- MEAN ---");
		System.out.println("Da lista "+listOne.toString()+"a média dos valores são:");
		System.out.println(pOne.mean(listOne));
		
		System.out.println("\n--- VARIANCE ---");
		System.out.println("Da lista "+listOne.toString()+" a variação é: ");
		System.out.println(pOne.variance(listOne));
		
		
	}

}
