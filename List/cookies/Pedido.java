import java.util.ArrayList;
import java.util.List;

public class Pedido {

	List<PedidoCookie> cookies = new ArrayList<>();

	public void adicionarPedidoCookie(PedidoCookie pedido) {
		cookies.add(pedido);
	}

	public int obterTotalCaixas() {

		int totalCaixas = 0;
		for (PedidoCookie pedido : cookies) {
			totalCaixas += pedido.getQuantidadeCaixas();

		}

		return totalCaixas;
		// calcula e retorna a qtd de caixa total de todos os cookies encomendados
	}

	public int removerSabor(String sabor) {
		int totalCaixa = 0; // ele quer saber a qtd total de caixas
		for (PedidoCookie pedido : cookies) {
			if (pedido.getSabor().equals(sabor)) //adicionando qtd de caixas q estou removendo, estou percorrendo a lista toda e removendo todos com o nome morango por ex
				totalCaixa += pedido.quantidadeCaixas;
				// cookies.remove(sabor);
			}
			cookies.removeIf(x -> x.getSabor().equals(sabor)); //depois de juntar todos com o nome morango eu peço para excluir/remover
			
		return totalCaixa; //aqui retorna o total de caixas removidas
	}
}
