package Encontro01.parte02;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Car cr = new Car();
		Car cr2 = new Car();
		
		Bicycle bcc = new Bicycle();
		Bicycle bcc2 = new Bicycle();
		
		Building bld = new Building();
		Building bld2 = new Building();
		
		ArrayList<CarbonFootPrint> cfp = new ArrayList<>();
		cfp.add(cr);
		cfp.add(cr2);
		cfp.add(bcc);
		cfp.add(bcc2);
		cfp.add(bld);
		cfp.add(bld2);
		
		
		for (int i = 0; i < cfp.size(); i++) {
			System.out.println(cfp.get(i).getCarbonFootPrint());
		}
				
	}
}
