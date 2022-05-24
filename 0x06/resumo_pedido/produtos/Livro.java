package produtos;

public class Livro extends Produto{
	protected int paginas;
	protected String autor;
	protected int edicao;
	
	@Override
	public double obterPrecoLiquido() {
		return getPrecoBruto() * 1.15;
	}
	
	public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
		super(titulo, ano, pais, precoBruto);
		this.paginas = paginas;
		this.autor = autor;
		this.edicao = edicao;
		// TODO Auto-generated constructor stub
	}
	
}
