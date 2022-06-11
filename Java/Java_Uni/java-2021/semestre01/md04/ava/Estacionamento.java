package semestre01.md04.ava;

import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Estacionamento implements Serializable {
    // Especificações do Método Estacionamento
    private ArrayList<Carro> lCarros = new ArrayList<Carro>(); // Lista de Carros
    private ArrayList<Moto> lMotos = new ArrayList<Moto>(); // Lista de Motos

    public static void gravar(Estacionamento estacionamento) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("estacionamento.ser"))) {
            oos.writeObject(estacionamento);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Estacionamento ler() {
        try (ObjectInputStream ais = new ObjectInputStream(new FileInputStream("estacionamento.ser"))) {
            Estacionamento a = (Estacionamento) ais.readObject();
            return a;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Getters de Moto e Carro
    public ArrayList<Moto> getMoto() {
        return lMotos;
    }

    public ArrayList<Carro> getCarro() {
        return lCarros;
    }

    // toString
    @Override
    public String toString() {
        return "Estacionamento{" +
                "lCarros=" + lCarros +
                ", lMotos=" + lMotos +
                '}';
    }

    private void writeObject(ObjectOutputStream a) {
        try {
            a.defaultWriteObject();
            a.writeObject(lCarros);
            a.writeObject(lMotos);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream a){
        try {
            a.defaultReadObject();
             ArrayList<Carro> c = (ArrayList<Carro>) a.readObject();
             ArrayList<Moto> m = (ArrayList<Moto>) a.readObject();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
