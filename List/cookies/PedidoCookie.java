
public class PedidoCookie {
	String sabor;
	int quantidadeCaixas;
	
	
	
	
	public PedidoCookie(String sabor, int quantidadeCaixas) {
		super();
		this.sabor = sabor;
		this.quantidadeCaixas = quantidadeCaixas;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public int getQuantidadeCaixas() {
		return quantidadeCaixas;
	}
	public void setQuantidadeCaixas(int quantidadeCaixas) {
		this.quantidadeCaixas = quantidadeCaixas;
	}
	
}
