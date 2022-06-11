package semestre01.md03.Q1;

public class TestException {
    public static void main(String[] args) {
        System.out.println("inicio do main");
        m1();
        System.out.println("fim do main");
    }
    static void m1() {
        System.out.println("inicio do metodol");
        m2();
        System.out.println("fim do metodol");
    }
    static void m2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        for (int i = 0; i <= 15; i++) {
            try {
            	array[i] = i;
            	System.out.println(i);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("A posi��o [" + i + "] do vetor inexiste!");
				e.printStackTrace();
			}
            
        }
        System.out.println("fim do metodo2");
    }
}

