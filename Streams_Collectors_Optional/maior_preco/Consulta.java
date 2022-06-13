import java.util.*;
import java.util.stream.Collectors;

public class Consulta {

	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

		List<Produto> filtroLivro = pedido.produtos.stream().filter(c -> c.getCategoria() == CategoriaProduto.LIVRO)
				.collect(Collectors.toList());

		return filtroLivro;

		// O método deve filtrar a lista de produtos e retornar todos os produtos cuja
		// categoria seja igual = LIVRO “CategoriaProduto.LIVRO”

	}

	public static Produto obterProdutoMaiorPreco(List<Produto> listaProduto) {
		// retorna oq tem mais preco

		List<Produto> precoMax = listaProduto.stream().sorted(Comparator.comparing(Produto::getPreco).reversed())
				// .limit(1)
				.collect(Collectors.toList());

		return precoMax.get(0);

		/*outro modo de fazer
		 * Você disse:Produto precoMax;
		 * 
		 * precoMax = listaProduto .stream() .max(Comparator.comparing(produto ->
		 * produto.getPreco())).get();
		 * 
		 * 
		 * 
		 * return precoMax;
		 */
	}

}
