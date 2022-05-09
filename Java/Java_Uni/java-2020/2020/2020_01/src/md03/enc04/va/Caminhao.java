package md03.enc04.va;

public class Caminhao extends Veiculo {

	public Caminhao(double combustivel, double limiteCombustivel, double gastoKM) {
		super("DIESEL", combustivel, limiteCombustivel, gastoKM);
	}
	public void dirigir(double distanciaKM) {
		double aux = (this.getCombustivel()-(distanciaKM/this.getGastoKM()))-1.6;
		try {
			if (aux < 0) {
				throw new CombustivelException("Distância percorrida incompatível com o combustível atual no tanque!");
			}
			this.setCombustivel(aux);
		} catch (CombustivelException e) {
			System.out.println(e.getMessage());
		}
	}
	public void abastecer(String tipoCombustivel, double qntL) {
		try {
			if (!this.getTipo().equals((tipoCombustivel).toUpperCase()))
				throw new CombustivelException("Combustível Incompatível!");
			if ((qntL+this.getCombustivel()) > this.getLimiteCombustivel() || qntL < 0) 
				throw new LimiteException();
			this.setCombustivel(this.getCombustivel()+qntL);
		} catch(LimiteException | CombustivelException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
