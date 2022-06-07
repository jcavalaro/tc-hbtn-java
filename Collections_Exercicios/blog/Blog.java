import java.util.*;

public class Blog {

	List<Post> listaPostagem = new ArrayList<>();

	public List<Post> getListaPostagem() {
		return listaPostagem;
	}

	public void setListaPostagem(List<Post> listaPostagem) {
		this.listaPostagem = listaPostagem;
	}

	public void adicionarPostagem(Post listaPost) {
		listaPostagem.add(listaPost);
		// adicionando lista de postagem
	}

	public Set<String> obterTodosAutores() {
		Set<String> obtemAutor = new TreeSet<>();
		
		for(Post chave : listaPostagem) {
			
			obtemAutor.add(chave.getAutor());
			
		}

		return obtemAutor;
		// que retorna um Set com todos autores que possuem pelo menos um post no blog e
		// deve-se retornar a lista de autores ordenados pelo nome.
	}

	public Map<String, Integer> obterContagemPorCategoria() {
		Map<String, Integer> mapa = new TreeMap<>();
		
		for(Post chave : listaPostagem) {
			int i = 1;
			if(mapa.containsKey(chave.getCategoria())) {
				
				i = mapa.get(chave.getCategoria());
				mapa.put(chave.getCategoria(), i++);
				
			}
			mapa.put(chave.getCategoria(), i);
		}

		return mapa;
	}

}
