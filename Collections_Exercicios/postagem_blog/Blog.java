import java.util.*;

public class Blog {

	private List<Post> postagens;
		
	public Blog() {
		this.postagens = new ArrayList<>();
	}

	public void adicionarPostagem(Post postagem) throws Exception {
		//verificar se postagem ja foi feita
		//msm autor mesmo titulo - lancar exceção se n, add
		
		for(Post chave : postagens) {
			
			if(chave.getAutor().equals(postagem.getAutor())) {
				if(chave.getTitulo().equals(postagem.getTitulo())) {
					throw new Exception("Postagem jah existente");
				}
			}	
		}
		postagens.add(postagem);
		// adicionando lista de postagem
	}

	public Set<Autor> obterTodosAutores() {
		Set<Autor> obtemAutor = new TreeSet<>();
		
		for(Post chave : postagens) {
			
			obtemAutor.add(chave.getAutor());
		}

		return obtemAutor;
		// que retorna um Set com todos autores que possuem pelo menos um post no blog e
		// deve-se retornar a lista de autores ordenados pelo nome.
	}

	public Map<Categorias, Integer> obterContagemPorCategoria() {
		Map<Categorias, Integer> mapa = new HashMap<>();
		
		for(Post chave : postagens) {
			int i = 1;
			if(mapa.containsKey(chave.getCategoria())) {
				
				i = mapa.get(chave.getCategoria());
				mapa.put(chave.getCategoria(), i++);
				
			}
			mapa.put(chave.getCategoria(), i);
		}

		return mapa;
	}
	
	public Set<Post> obterPostsPorAutor(Autor autor) {
		//set de posts daquele autor - post deve ser ordenado pelo titulo
		Set<Post> obterPostAutor = new TreeSet<>();
		
		for(Post chave : postagens) {
			if(chave.getAutor().equals(autor)) {
				obterPostAutor.add(chave);
			}
		}
		return obterPostAutor;
	}
	
	public Set<Post> obterPostsPorCategoria(Categorias categorias){
		Set<Post> obterCategoria = new TreeSet<>();
		
		for(Post chave: postagens) {
			if(chave.getCategoria().equals(categorias)) {
				obterCategoria.add(chave);
			}	
		}
		return obterCategoria;
	}
	
	public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
		Map<Categorias, Set<Post>> mapa = new TreeMap<>();
		
		for(Categorias chave : Categorias.values()) {
			mapa.put(chave, obterPostsPorCategoria(chave));
		}
		
		return mapa;
	}

	public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
		Set<Autor> autor = obterTodosAutores();
		Map<Autor, Set<Post>> mapa = new TreeMap<>();
		
		for(Autor chave : autor) {
			mapa.put(chave, obterPostsPorAutor(chave));
		}
		
		return mapa;
	}
	
	
}
