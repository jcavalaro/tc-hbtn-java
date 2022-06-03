import java.util.*;

public class Biblioteca<T>{

	List<Midia> listaMidia = new ArrayList<Midia>();
	
	public void adicionarMidia(Midia elementoGenerico) {
		listaMidia.add(elementoGenerico);
		// que recebe um valor do tipo genérico e adiciona o elemento na lista.
		
	}
	
	public List<Midia> obterListaMidias(){
		return listaMidia;
		//retornar uma lista de elementos
	}

}
