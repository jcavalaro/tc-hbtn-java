import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {
	protected String titulo;
	protected String autor;
	protected double preco;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws LivroInvalidoException {

		if (titulo.length() < 3) {
			throw new LivroInvalidoException("Titulo de livro invalido");
		}

		this.titulo = titulo;

		// Título do livro deve possuir pelo menos 3 caracteres, senão Titulo de livro
		// invalido - Exceção: LivroInvalidoException.
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) throws AutorInvalidoException {

		String[] verificacao = autor.split(" ");
		if (verificacao.length > 1) {
			this.autor = autor;
		} else {
			throw new AutorInvalidoException("Nome de autor invalido");
		}

		/*
		 * if(autor.matches("^[a-zA-Z]+ [a-zA-Z]+$")) { this.autor = autor; } throw new
		 * AutorInvalidoException("Nome de autor invalido");
		 */
		// Nome do autor deve possuir pelo menos dois nomes, senão Nome de autor
		// invalido - Exceção: AutorInvalidoException.
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) throws LivroInvalidoException {

		if (preco > 0) {
			this.preco = preco;
		} else {
			throw new LivroInvalidoException("Preco de livro invalido");
		}
	}

	public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
		super();
		setTitulo(titulo);
		setAutor(autor);
		setPreco(preco);
	}

}
