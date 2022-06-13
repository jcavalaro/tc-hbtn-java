import java.util.*;

public class Pedido {

	private int codigo;
	List<Produto> produtos;
	Cliente cliente;
	
	public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.produtos = produtos;
		this.cliente = cliente;
	}



}
