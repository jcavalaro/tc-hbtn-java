import java.util.*;

public class Armazem<T> implements Armazenavel<T>{
	
	public Map<String, T> itensArmazenados;
	

	public Armazem() {
		itensArmazenados = new TreeMap<>();
	}

	@Override
	public void adicionarAoInventario(String nomeItem, T adicionaInventario) {
		
		itensArmazenados.put(nomeItem, adicionaInventario);
	
	}

	@Override
	public T obterDoInventario(String nomeItem) {
		
		for(String chave:itensArmazenados.keySet()) {
			if(nomeItem.equals(chave)) {
				return itensArmazenados.get(chave);
			}
		}
		return null;
	}
	
	
	
}
