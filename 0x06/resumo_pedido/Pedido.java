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
	
	public void apresentarResumoPedido() {
		double totalDeItens = 0;
		double produtoTotal = 0;
		double desconto = 0;
		double valorFinal = 0;
		System.out.println("------- RESUMO PEDIDO -------");
		for(ItemPedido itemPedido : itens) {
			
			totalDeItens = itemPedido.getQuantidade() * itemPedido.getProduto().obterPrecoLiquido();
			produtoTotal = produtoTotal + totalDeItens;
			
			System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %s  Total: %.2f\n", 
					itemPedido.getProduto().getClass().getSimpleName(), itemPedido.getProduto().getTitulo(), itemPedido.getProduto().obterPrecoLiquido(), itemPedido.getQuantidade(), totalDeItens);
		}
		desconto = (percentualDesconto / 100)*produtoTotal;
		valorFinal = produtoTotal - desconto;
		System.out.printf("----------------------------\nDESCONTO: %.2f\nTOTAL PRODUTOS: %.2f\n----------------------------\nTOTAL PEDIDO: %.2f\n----------------------------\n", 
				desconto, produtoTotal, valorFinal);
		/* ----------------------------
    DESCONTO: 0,00
    TOTAL PRODUTOS: 112,62
    ----------------------------
    TOTAL PEDIDO: 112,62
    ----------------------------*/
		
	}

	public double getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	
	
}
