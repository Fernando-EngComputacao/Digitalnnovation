package md04.enc01.atv01;

import java.util.ArrayList;

public class A extends B {

	public void metodoDeA() {
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) 
			vetor.add(0 + (int)( Math.random()*100));
		
		System.out.println(vetor.toString());
	}
	
}
