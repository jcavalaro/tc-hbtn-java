import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

	private String nome;
	private double preco;
	private double percentualMarkup = 0.10;
	
	


	Supplier<Double> precoComMarkup = () -> (getPreco()*getPercentualMarkup())+getPreco();
	
	Consumer<Double> atualizarMarkup = (novoPercentual) -> percentualMarkup=(novoPercentual/100);
	
	
	
	public Produto(double preco, String nome) {
		super();
		this.nome = nome;
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getPercentualMarkup() {
		return percentualMarkup;
	}


	public void setPercentualMarkup(double percentualMarkup) {
		this.percentualMarkup = percentualMarkup;
	}

	public Supplier<Double> getPrecoComMarkup() {
		return precoComMarkup;
	}



	}
