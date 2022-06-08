import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica{

	private int quantidadeTransacoes; //é a quantidade de transações efetudas na conta, seja saque o depósito.
	
	public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
		super(numeracao, taxaJurosAnual);
		// TODO Auto-generated constructor stub
	}

	public int getQuantidadeTransacoes() {
		return quantidadeTransacoes;
	}
	
	@Override
	public void sacar(double valor) throws OperacaoInvalidaException {
		// TODO Auto-generated method stub
		super.sacar((valor)+0.10);
	}
	
	@Override
	public void depositar(double valor) throws OperacaoInvalidaException {
		// TODO Auto-generated method stub
		super.depositar(valor-0.10);
	}
	
}
