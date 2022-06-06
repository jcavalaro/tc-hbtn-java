import java.util.*;

public interface Armazenavel<T>{

	public void adicionarAoInventario(String nomeItem, T adicionaInventario);
	
	public T obterDoInventario(String nomeItem);
}
