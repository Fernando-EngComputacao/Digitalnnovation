package md03.enc01.atv02;

public class Building implements CarbonFootPrint{
	private int numeroPortas;
	private boolean energiaRenovavel;
	private int numeroLampada;
	private boolean arCondicionado;
		
		
	@Override
	public String getCarbonFootPrint() {
		return "Calculando a pegada de carbono em Building";
	
	}
	
	// Getters and Setters \\
		public int getNumeroPortas() {
			return numeroPortas;
		}

		public void setNumeroPortas(int numeroPortas) {
			this.numeroPortas = numeroPortas;
		}

		public boolean isEnergiaRenovavel() {
			return energiaRenovavel;
		}

		public void setEnergiaRenovavel(boolean energiaRenovavel) {
			this.energiaRenovavel = energiaRenovavel;
		}

		public int getNumeroLampada() {
			return numeroLampada;
		}

		public void setNumeroLampada(int numeroLampada) {
			this.numeroLampada = numeroLampada;
		}

		public boolean isArCondicionado() {
			return arCondicionado;
		}

		public void setArCondicionado(boolean arCondicionado) {
			this.arCondicionado = arCondicionado;
		}

}
