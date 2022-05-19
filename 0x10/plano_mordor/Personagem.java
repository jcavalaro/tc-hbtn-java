public class Personagem {
    private int pontosDeFelicidade;
    
    public int getPontosDeFelicidade() {
     return pontosDeFelicidade;
 }

 public void setPontosDeFelicidade(int pontosDeFelicidade) {
     this.pontosDeFelicidade = pontosDeFelicidade;
 }

 public Humor obterHumorAtual() {
    
     if (this.pontosDeFelicidade < (-5)){
         return new Irritado();
     }else if (this.pontosDeFelicidade <= 0){
         return new Triste();
     }else if (this.pontosDeFelicidade <= 15){
         return new Feliz();
     }else{
         return new MuitoFeliz();
     }
     
     // retorna um objeto da classe Humor
 }

 public void comer(Comida[] comidas) { //same for (int x=0;x++;lista.lenght)
     for (Comida papa : comidas){    //tipo do objeto referencia : listadoobjeto
         int x = this.getPontosDeFelicidade();
          setPontosDeFelicidade(x += papa.getPontosDeFelicidade());
     }

     // atualizar valor de pontosDeFelicidade
 }

 @Override
 public String toString() {
     // para retornar <pontos de felicidade> - <humor>
     return getPontosDeFelicidade() + " - " + obterHumorAtual().getClass().getSimpleName();
     // Dica: para apresentar o nome da classe de uma referência utilize 
     // objetoHumor.getClass().getName() ou objetoHumor.getClass().getSimpleName() 
     // para nome da classe sem o pacote.
 }
}
