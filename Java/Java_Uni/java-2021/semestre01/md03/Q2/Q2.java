package semestre01.md03.Q2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        try {
        	Scanner keyboard = new Scanner(System.in);
            System.out.println("Eu sei dividir!");
        	System.out.print("Informe o primeiro valor:");
            int x = keyboard.nextInt();
            System.out.print("Informe o segundo valor:");
            int y = keyboard.nextInt();
            
            double r = (x / y);
            System.out.println("O resultado da divis�o � " + r);
        } catch (ArithmeticException e){
            System.err.println("� vetado a divis�o por zero!");
            e.printStackTrace();
        } catch (InputMismatchException e) {
			System.err.print("Entrada inv�lida!\n");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Erro!\n");
			e.printStackTrace();
		}


    }
}
