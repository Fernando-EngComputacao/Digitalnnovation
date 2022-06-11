package semestre01.file.q2;

public class Teste {
    public static void main(String[] args){

        //Objetos
        Ingresso ing = new Ingresso(10.00);
        Vip vip = new Vip(10.00, 5.00);
        Normal nor = new Normal(10.00);
        CamaroteInferior cai = new CamaroteInferior(10.00, 7.00, "A01");
        CamaroteSuperior cas = new CamaroteSuperior(10.00, 7.00, 5.00);

        //Usar Objetos
        //Ingresso
        System.out.println(ing.imprimeValor() + "\n");
        //Ingresso VIP
        System.out.println(vip.imprimeValor() + "\n");
        //Ingresso Normal
        System.out.println(nor.imprimeValor() + "\n" + nor.imprimeIngresso() + "\n");
        //Ingresso Camarote Inferiro
        System.out.println(cai.imprimeValor() + "\nLocalização: " + cai.getLocalizacao() + "\n");
        //Ingresso Camarote Superior
        System.out.println(cas.imprimeValor());
    }
}
