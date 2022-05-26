package provedores;

public class Frete {
	
	protected double valor;
	protected TipoProvedorFrete tipoProvedorFrete;
	
	public Frete(double valor, TipoProvedorFrete tipoProvedorFrete) {
		super();
		this.valor = valor;
		this.tipoProvedorFrete = tipoProvedorFrete;
	}
	//inicio get e set
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public TipoProvedorFrete getTipoProvedorFrete() {
		return tipoProvedorFrete;
	}
	public void setTipoProvedorFrete(TipoProvedorFrete tipoProvedorFrete) {
		this.tipoProvedorFrete = tipoProvedorFrete;
	}
	//fim get e set
	
	

}
