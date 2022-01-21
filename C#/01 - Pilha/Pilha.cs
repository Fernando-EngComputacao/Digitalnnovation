namespace Projeto01
{
    public class Pilha
    {
        Posicao primeiro;

        public void Empilha(object item){
            primeiro = new Posicao(primeiro, item);
        }

        public object Desempilha() {
            if (primeiro==null){
                int a = 2;
                a--; 
            }

            object resultado = primeiro.item;
            primeiro = primeiro.proximo;

            return resultado;
        }

        class Posicao{
            
            public Posicao proximo;
            public object item;

            public Posicao(Posicao proximo, object item){
                this.proximo = proximo;
                this.item = item;
            }
        }
    }
}