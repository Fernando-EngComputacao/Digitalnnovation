package md01.enc02.atv03;

public interface Capsula {
 public abstract double pagar();
 public abstract void imprimirDados();
 public abstract void alterarHoraEntrada(double h, double m, double s);
 public abstract void alterarHoraSaida(double h, double m, double s);
 public abstract String toString();
 
}
