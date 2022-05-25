
public class Mensagem {
	
	protected String texto;
	protected TipoMensagem tipoMensagem;
	
	
	//inicio construtor
	public Mensagem(String texto, TipoMensagem tipoMensagem) {
		super();
		this.texto = texto;
		this.tipoMensagem = tipoMensagem;
	}
	//fim construtor
	
	//inicio encapsulamento
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public TipoMensagem getTipoMensagem() {
		return tipoMensagem;
	}
	public void setTipoMensagem(TipoMensagem tipoMensagem) {
		this.tipoMensagem = tipoMensagem;
	}
	//fim encapsulamento
	
	
}
