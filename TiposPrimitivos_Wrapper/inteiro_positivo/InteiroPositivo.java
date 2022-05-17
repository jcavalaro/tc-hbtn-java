public class InteiroPositivo {
    private int valor; //envelopado, por isso precisamos adicionar o get e o set
        
    
        public int getValor() {
        return valor;
        }
        public void setValor(int valor) {
            ex(valor);
        this.valor = valor;
        }
        
        public InteiroPositivo(int valor) {
            this.valor = valor;
            
        }
        public InteiroPositivo(String valor) {
            ex(Integer.parseInt(valor));
            this.valor = Integer.parseInt(valor);
            
        }
    
        public void ex(int valor) {
            if(valor <= 0) {
                throw new IllegalArgumentException ("Valor nao eh um valor inteiro positivo");
            }
        }
        
        public Boolean ehPrimo() {
            for (int i = 1; i <= this.valor; i++) {
                if (this.valor % 2 == 0 || this.valor == 1)
                    return false;
            }
            return true;
        }
    }