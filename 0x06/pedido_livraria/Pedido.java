import produtos.*;

public class Pedido {
	
	protected double percentualDesconto;
	protected ItemPedido[] itens;
	
	
	public Pedido(double percentualDesconto, ItemPedido[] itens) {
		super();
		this.percentualDesconto = percentualDesconto;
		this.itens = itens;
	}
	
	public double calcularTotal() {
		double x=0;
		for (ItemPedido itemPedido : itens) {
			x = x+(itemPedido.getQuantidade() * itemPedido.getProduto().obterPrecoLiquido());
			
		}
		x = x - ((percentualDesconto / 100)* x);
		return x;
	}

	public double getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	
	
}
