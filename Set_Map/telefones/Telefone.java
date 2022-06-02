
public class Telefone {
	private String numero;
	private String codigoArea;
	
	

	public Telefone(String codigoArea,String numero) {
		super();
		this.numero = numero;
		this.codigoArea = codigoArea;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCodigoArea() {
		return codigoArea;
	}
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+codigoArea+") "+numero;
	}
	
}
