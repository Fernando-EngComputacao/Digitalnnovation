package md04.enc08.avaliacao;

import java.util.ArrayList;

public class Probability implements ProbabilityInterface {
	// Constructor \\
	public Probability() {}
	
	// Methods \\
	@Override
	public ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> c = new ArrayList<Integer>();
		for (int o = 0; o < b.size(); o++) {
			if (!c.contains(b.get(o))) 
				c.add(b.get(o));
		}
		for (int i = 0; i < a.size(); i++) {
			if (!c.contains(a.get(i))) 
				c.add(a.get(i));
		}
		return c;
	}
	@Override
	public ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> rest = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			if (b.contains(a.get(i)) && !rest.contains(a.get(i)))
				rest.add(a.get(i));
		}
		return rest;
	}
	@Override
	public double valueProbability(ArrayList<Integer> a, int number) {
		int qnt = 0;
		for (int i = 0; i < a.size(); i++) {
			if (number == a.get(i))
				qnt++;
		}
		return ((qnt*1.0)/(a.size()*1.0));
	}
	@Override
	public ArrayList<Double> totalProbability(ArrayList<Integer> a) {
		ArrayList<Integer> frequence = new ArrayList<Integer>();
		ArrayList<Double> probabilityAll = new ArrayList<Double>();
		
		for (int i = 0; i < a.size(); i++) {
			int count = 0;
			for (int j = 0; j < a.size(); j++) {
				if (a.get(i) == a.get(j)) {
					count++;
				}
			}
			if (!frequence.contains(a.get(i))) {
				frequence.add(a.get(i));
				probabilityAll.add((count*1.0)/(a.size()*1.0));
			}
			
		}
		return probabilityAll;
	}
	@Override
	public double mean(ArrayList<Integer> a) {
		double count = 0.0;
		for (int i = 0; i < a.size(); i++) {
			count += a.get(i);
		}
		return (count/(a.size()));
	}
	@Override
	public double variance(ArrayList<Integer> a) {
		double media = mean(a);
		double variance = 0;
		for (int i = 0; i < a.size(); i++) {
			variance += (Math.pow((a.get(i) - media), 2) / a.size());
		}
		return variance;
	}
	public void toPrint(ArrayList<Integer> list) {
		System.out.println(list.toString());
	}
}
