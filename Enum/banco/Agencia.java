import java.util.*;

public class Agencia {
	private String nome; //nome da agencia

	List<Cliente> clientes = new ArrayList<>();

	public List<Cliente> getClientes() {
		return clientes;
	}

	public String getNome() {
		return nome;
	}

	public Agencia(String nomeAg) {
		super();
		this.nome = nomeAg;
		this.clientes = clientes;
	}

	public boolean novoCliente(String nomeCliente, double valorTranInicio) {

		if (buscarCliente(nomeCliente) == null) {
			clientes.add(new Cliente(nomeCliente, valorTranInicio));
			return true;
		}
		return false;
	}

	public boolean adicionarTransacaoCliente(String nomeCliente, double valorTran) {
		if(buscarCliente(nomeCliente) != null){
			((Cliente) buscarCliente(nomeCliente)).adicionarTransacao(valorTran);
			return true;
			
		}
		return false;
	}

	public Cliente buscarCliente(String nomeCliente) {
		for (Cliente x : clientes) {
			if (x.getNome().equals(nomeCliente)) {
				return x;
			}
		}
		return null;
	}
}
