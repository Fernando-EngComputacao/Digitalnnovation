package md04.enc08.avaliacao;

import java.util.ArrayList;

public interface ProbabilityInterface {
	ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b);
	ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b);
	double valueProbability(ArrayList<Integer> a, int number);
	ArrayList<Double> totalProbability(ArrayList<Integer> a);
	double mean(ArrayList<Integer> a);
	double variance(ArrayList<Integer> a);
	
	
}
