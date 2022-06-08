
public class Gerente extends Empregado{

	public Gerente(double salarioFixo) {
		super(salarioFixo);
	}
	
	@Override
	public double calcularBonus(Departamento departamento) {
		if(departamento.alcancouMeta() == true) {
			double bonusEmpregado = (salarioFixo*0.20);
			double adicionalGerente = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
			double adicionalUmPorcento = adicionalGerente * 0.01;
			return bonusEmpregado + adicionalUmPorcento;
		}
		return 0; //ver oq tenho que fazer causa false
		
	}
	
}
