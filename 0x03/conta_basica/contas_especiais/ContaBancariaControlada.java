
public class ContaBancariaControlada extends ContaBancariaBasica{

	private double saldoMinimo; // é o saldo que a conta deve ter para n ser taxada
	private double valorPenalidade; //é o valor de penalidade a aplicar à conta em que o saldo esteja abaixo do saldo mínimo.
	
	public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
		super(numeracao, taxaJurosAnual);
		this.valorPenalidade = valorPenalidade;
		this.saldoMinimo = saldoMinimo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aplicarAtualizacaoMensal() {
		
		if(getSaldo()<=saldoMinimo || getSaldo()==0) {
			this.saldo = (( getSaldo() + calcularJurosMensal() ) - calcularTarifaMensal()-valorPenalidade);
		}else {
			this.saldo = ( getSaldo() + calcularJurosMensal() ) - calcularTarifaMensal();
		}

	}
	
}
