import produtos.*;

public class ItemPedido {
	protected int quantidade;
	protected Produto produto;
		
	public ItemPedido(Produto produto, int quantidade) {
		super();
		this.quantidade = quantidade;
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
