public class PersonagemGame {
	private int saudeAtual;
    private String nome;
    private String status;
    private String nomeInicial;
    
    public PersonagemGame(int saudeAtualInicial, String nomeInicial) {
		setSaudeAtual(saudeAtualInicial);
		this.nomeInicial = nomeInicial;
	}
    
	public String getNomeInicial() {
		return nomeInicial;
	}
	public String getStatus() {
		return status;
	}
	public int getSaudeAtual() {
		return saudeAtual;
	}
	public void setSaudeAtual(int saudeAtual) {
		this.saudeAtual = saudeAtual;
		if(this.saudeAtual>0) {
			this.status = "vivo";
		}else if(this.saudeAtual==0){
			this.status="morto";
		}
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.isEmpty()) {
		    this.nome = nomeInicial;
		}else
		this.nome = nome;
		
	}
    
	public void tomarDano(int quantidadeDeDano) {
		setSaudeAtual(getSaudeAtual()-quantidadeDeDano);   		
    		if(getSaudeAtual() < 0) {
    			setSaudeAtual(0);
    		
    	}		
    }
    public void receberCura(int quantidadeDeCura){
    	setSaudeAtual(getSaudeAtual() + quantidadeDeCura);
    		if(getSaudeAtual() > 100) {
    			setSaudeAtual (100);
    		}
    }
    
}

