import java.util.*;

public class Cliente {
	private String nome; //nome do cliente
	List<Double> transacoes = new ArrayList<>();

	public Cliente(String nome, double transacoes) {
		this.nome = nome;
		adicionarTransacao(transacoes);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Double> getTransacoes() {
		return transacoes;
	}
	public void setTransacoes(List<Double> transacoes) {
		this.transacoes = transacoes;
	}

	public void adicionarTransacao(double valorTransacao) {
		this.transacoes.add(valorTransacao);
	}

}
