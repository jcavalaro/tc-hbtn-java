
public class Eletronico {

	protected String descricao;
	protected double valor;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Eletronico(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return String.format("[%s] R$ %6f", getDescricao(), getValor());
	}
	
	
}
