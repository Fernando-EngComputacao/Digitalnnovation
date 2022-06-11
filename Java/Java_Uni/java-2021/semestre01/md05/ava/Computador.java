package semestre01.md05.ava;

public class Computador {
    private int numero;
    private int status;
    private String modelo;
    private Double capacidadeMemoria;
    private String placaVideo;
    private String processador;

    // Constructor
    public Computador(int numero, int status, String modelo, Double capacidadeMemoria, String placaVideo, String processador) {
        this.numero = numero;
        this.status = status;
        this.modelo = modelo;
        this.capacidadeMemoria = capacidadeMemoria;
        this.placaVideo = placaVideo;
        this.processador = processador;
    }
    public Computador(){}


    // Getters and Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public void setCapacidadeMemoria(Double capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    //toString
    @Override
    public String toString() {
        return "Computador{" +
                "numero=" + numero +
                ", status=" + status +
                ", modelo='" + modelo + '\'' +
                ", capacidadeMemoria=" + capacidadeMemoria +
                ", placaVideo='" + placaVideo + '\'' +
                ", processador='" + processador + '\'' +
                '}';
    }
}
