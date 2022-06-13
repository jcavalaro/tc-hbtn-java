import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Consulta {

	public static List<Produto> obterEletronicoDoPedido(Pedido pedido) {

		List<Produto> filtroEletronico = pedido.produtos.stream()
				.filter(c -> c.getCategoria() == CategoriaProduto.ELETRONICO).collect(Collectors.toList());

		return filtroEletronico;

		// O método deve filtrar a lista de produtos e retornar todos os produtos cuja
		// categoria seja igual = LIVRO “CategoriaProduto.LIVRO”

	}

	public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedido) {

		 List<Pedido> ped = pedido.stream()
				.filter(pedidos -> pedidos.getProdutos().stream()
						.anyMatch(produto -> produto.getCategoria().equals(CategoriaProduto.ELETRONICO)))
				.collect(Collectors.toList());
		 return ped;
	}

	public static Produto obterProdutoMaiorPreco(List<Produto> listaProduto) {
		// retorna oq tem mais preco

		List<Produto> precoMax = listaProduto.stream().sorted(Comparator.comparing(Produto::getPreco).reversed())
				// .limit(1)
				.collect(Collectors.toList());

		return precoMax.get(0);

		/*
		 * outro modo de fazer Você disse:Produto precoMax;
		 * 
		 * precoMax = listaProduto .stream() .max(Comparator.comparing(produto ->
		 * produto.getPreco())).get();
		 * 
		 * 
		 * 
		 * return precoMax;
		 */
	}

	public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> listaProduto, double precoMin) {
		List<Produto> precoMinimo = listaProduto.stream().filter(preco -> preco.getPreco() >= precoMin)
				.collect(Collectors.toList());
		return precoMinimo;

	}

}
