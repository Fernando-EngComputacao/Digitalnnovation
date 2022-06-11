package semestre02.M02.Prova;

public class Teste {
    public static void main(String[] args) {

        // Questão 01
        Q01 q1  = new Q01("AABCCBAA");
        Q01 q2 = new Q01("ADDFDDA");
        Q01 q3 = new Q01("ABFFBB");
        Q01 q4 = new Q01("1123211");
        Q01 q5 = new Q01("1233212");

        System.out.println("*** QUESTÃO 01 ***");
        System.out.println("Caso 01 - Palavra [AABCCBAA] -> "+q1.verifica());
        System.out.println("Caso 02 - Palavra [ADDFDDA] -> "+q2.verifica());
        System.out.println("Caso 03 - Palavra [ABFFBB] -> "+q3.verifica());
        System.out.println("Caso 04 - Palavra [1123211] -> "+q4.verifica());
        System.out.println("Caso 05 - Palavra [1233212] -> "+q5.verifica());


        // Questão 02
        Q02 qa = new Q02("((A+B)");
        Q02 qb = new Q02("A+B(");
        Q02 qc = new Q02(")A+B( – C () )(");
        Q02 qd = new Q02("(A+B)) – (C + D");
        Q02 qe = new Q02("((A+B)) – (C + D)");
        Q02 qf = new Q02("(A+B)");

        System.out.println("\n*** QUESTÃO 02 ***");
        System.out.println(qa.verifica()+"\n");
        System.out.println(qb.verifica()+"\n");
        System.out.println(qc.verifica()+"\n");
        System.out.println(qd.verifica()+"\n");
        System.out.println(qe.verifica()+"\n");
        System.out.println(qf.verifica()+"\n");

    }
}
