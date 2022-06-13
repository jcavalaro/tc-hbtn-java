import java.util.*;
import java.util.stream.Collectors;

public class Consulta {

	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
		
		 List<Produto> filtroLivro = pedido.produtos.stream()
				 .filter(c -> c.getCategoria() == CategoriaProduto.LIVRO)
				 .collect(Collectors.toList());
		
		 return filtroLivro;
		 
		// O método deve filtrar a lista de produtos e retornar todos os produtos cuja
		// categoria seja igual = LIVRO “CategoriaProduto.LIVRO”
		
		 
	}

}
