package md04.enc08.avaliacao;

import java.util.ArrayList;

public class ListGenerator {
	private int startRange;
	private int endRange;
	private int quantity;
	
	// Constructor \\
	public ListGenerator(int startRange, int endRange, int quantity) {
		this.startRange = startRange;
		this.endRange = endRange;
		this.quantity = quantity;
	}
	
	// Methods \\
	public ArrayList<Integer> generate(){
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		for (int i = 0; i < this.getQuantity(); i++) 
			vetor.add((this.getStartRange() + (int)(Math.random() * ((this.getEndRange()-this.getStartRange())+1))));
		return vetor;		
	}
	public ArrayList<Integer> generatePack(int[] values){
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		int aux = values.length;
		for (int i = 0; i < this.getQuantity(); i++) {
			vetor.add(values[0 + (int)(Math.random() * aux)]);
		}
		return vetor;
	}
	
	
	// Getters and Settes \\
	public int getStartRange() {
		return startRange;
	}
	public void setStartRange(int startRange) {
		this.startRange = startRange;
	}
	public int getEndRange() {
		return endRange;
	}
	public void setEndRange(int endRange) {
		this.endRange = endRange;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
