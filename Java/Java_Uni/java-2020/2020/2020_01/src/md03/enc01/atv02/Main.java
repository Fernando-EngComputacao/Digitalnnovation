package md03.enc01.atv02;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Car cr = new Car();
		Car cr2 = new Car();
		
		Bicycle bcc = new Bicycle();
		Bicycle bcc2 = new Bicycle();
		
		Building bld = new Building();
		Building bld2 = new Building();
		
		ArrayList<CarbonFootPrint> cb = new ArrayList<>();
		cb.add(cr);
		cb.add(cr2);
		cb.add(bcc);
		cb.add(bcc2);
		cb.add(bld);
		cb.add(bld2);
		
		
		for (int i = 0; i < cb.size(); i++) {
			System.out.println(cb.get(i).getCarbonFootPrint());
		}
				
	}
}
