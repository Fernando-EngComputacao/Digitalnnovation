package semestre01.file.q2;

public class CamaroteInferior extends Vip{
    private String localizacao;

   //Construtor
   public CamaroteInferior(Double valor, Double valorAddVip, String localizacao){
       super(valor, valorAddVip);
       this.localizacao = localizacao;
   }
   public CamaroteInferior(){
       super();
   }

    //Métodos
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
