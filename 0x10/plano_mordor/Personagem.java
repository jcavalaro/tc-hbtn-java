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
     
     
 }

 public void comer(Comida[] comidas) { 
     for (Comida papa : comidas){    
         int x = this.getPontosDeFelicidade();
          setPontosDeFelicidade(x += papa.getPontosDeFelicidade());
     }

     // atualizar valor de pontosDeFelicidade
 }

 @Override
 public String toString() {
     
     return getPontosDeFelicidade() + " - " + obterHumorAtual().getClass().getSimpleName();
    
 }
}
