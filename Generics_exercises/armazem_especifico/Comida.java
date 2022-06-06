
public class Comida {

	protected String nome;
	protected double calorias;
	protected double preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Comida(String nome, int calorias, double preco) {
		super();
		this.nome = nome;
		this.calorias = calorias;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return String.format("[%s] %6f R$ %6f", getNome(), getCalorias(), getPreco());
	}
	
	
	
}
