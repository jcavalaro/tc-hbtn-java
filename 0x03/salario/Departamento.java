
public class Departamento {

	private double valorMeta;
	private double valorAtingidoMeta;
	
	public double getValorMeta() {
		return valorMeta;
	}
	public void setValorMeta(double valorMeta) {
		this.valorMeta = valorMeta;
	}
	public double getValorAtingidoMeta() {
		return valorAtingidoMeta;
	}
	public void setValorAtingidoMeta(double valorAtingidoMeta) {
		this.valorAtingidoMeta = valorAtingidoMeta;
	}
	public Departamento(double valorMeta, double valorAtingidoMeta) {
		super();
		this.valorMeta = valorMeta;
		this.valorAtingidoMeta = valorAtingidoMeta;
	}
	
	public boolean alcancouMeta() {
		
		if(this.valorAtingidoMeta >= this.valorMeta) {
			return true;
		}
		return false;
		//retorna se a meta foi atingida ou n
		
	}
	
}
