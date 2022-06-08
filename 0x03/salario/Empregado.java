
public class Empregado {
	protected double salarioFixo;

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public Empregado(double salarioFixo) {
		super();
		this.salarioFixo = salarioFixo;
	}
	
	public double calcularBonus(Departamento departamento) {
		
		if(departamento.alcancouMeta() == true) {
			double bonusEmpregado = (salarioFixo*0.10);
			return bonusEmpregado;
			
		}
		return 0; //ver oq tenho que fazer causa false
		
	}
	
	public double calcularSalarioTotal(Departamento departamento) {
		return salarioFixo + calcularBonus(departamento);
	}
	
}
