import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
	private String numeracao;
	protected double saldo;
	private double taxaJurosAnual;

	public String getNumeracao() {
		return numeracao;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getTaxaJurosAnual() {
		return taxaJurosAnual;
	}

	public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
		super();
		this.saldo = 0;
		this.numeracao = numeracao;
		this.taxaJurosAnual = taxaJurosAnual;
	}

	public void depositar(double valor) throws OperacaoInvalidaException {

		
		if(valor > 0) {
			
			this.saldo = getSaldo() + valor;
			
		}else{throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
	}
		// verifica se valor é maior que zero, senão deve lançar exceção
		// OperacaoInvalidaException, mensagem: Valor para deposito deve ser maior que 0
		// acrescenta valor ao saldo

	}

	public void sacar(double valor) throws OperacaoInvalidaException {
		
		if(valor > 0) {
			if(valor<=getSaldo()) {
				this.saldo = getSaldo() - valor;
			}else {
				throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
			}
		}else {
			throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0\n");
		}
		// verifica se valor é maior que zero, senão deve lançar exceção
		// OperacaoInvalidaException, mensagem: Valor de saque deve ser menor que 0
		// verifica se possui saldo o suficiente na conta, se não deve lançar exceção
		// OperacaoInvalidaException, mensagem: Valor de saque deve ser menor que o
		// saldo atual
		// diminui valor do saldo
	}

	public double calcularTarifaMensal() {
		double valorFixo = 10;
		double valorPorcento = getSaldo()*0.10;
		
		if(valorFixo>valorPorcento) {
			return valorPorcento;
		}else {
			return valorFixo;
		}
		
		// método que calcula a tarifa cobrada mensalmente pelo banco.
		// banco cobra R$ 10,00 ou 10% do saldo atual da conta, é utilizado aquele que
		// der o valor menor.
	}

	public double calcularJurosMensal() {
		double transJuros = getTaxaJurosAnual()/100;
		double jurosMensal = transJuros/12;
		
		if(getSaldo()>0) {
			return getSaldo()*jurosMensal;
		}else {
			return 0;	
		}
		
		/*
		 * método que calcula o valor em R$ do juros mensal a ser aplicado ao saldo da
		 * conta. taxa de juros é 0 quando a conta possui saldo negativo.
		 */
	}

	public void aplicarAtualizacaoMensal() {
		this.saldo = ( getSaldo() + calcularJurosMensal() ) - calcularTarifaMensal();
		// reajusta o saldo da conta subtraindo a tarifa mensal e adicionando o valor de
		// juros mensal.
	}

}
