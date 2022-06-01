import java.util.*;

public class Banco {
	private String nome;

	List<Agencia> agencias;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(List<Agencia> agencias) {
		this.agencias = agencias;
	}

	public Banco(String nomeBanco) {
		this.nome = nomeBanco;
		this.agencias = new ArrayList<>();
	}

	public Agencia buscarAgencia(String nomeAg) {
		for (Agencia a : agencias) {
			if (nomeAg.equals(a.getNome())) {
				return a;
			}
		}
		return null;
	}

	public boolean adicionarAgencia(String nomeAg) {
		if (buscarAgencia(nomeAg) != null) {
			return false;
		}
		agencias.add(new Agencia(nomeAg));
		return true;
	}

	public boolean adicionarCliente(String nomeAg, String nomeCliente, double valorTranInicial) {

		if (buscarAgencia(nomeAg) != null) {
			if (buscarAgencia(nomeAg).buscarCliente(nomeCliente) == null) {
				buscarAgencia(nomeAg).novoCliente(nomeCliente, valorTranInicial);
				return true; // se a ag existir e se o cliente não existir ele retornar true e faz a adicao
								// do cliente na ag
			}

		}
		return false; // se a ag n existir ou se o cliente ja existir, ele vai retornar null
	}

	public boolean adicionarTransacaoCliente(String nomeAg, String nomeCliente, double valorTran) {

		if (buscarAgencia(nomeAg) != null) {
			if (buscarAgencia(nomeAg).buscarCliente(nomeCliente) != null) {
				buscarAgencia(nomeAg).adicionarTransacaoCliente(nomeCliente, valorTran);
				return true;
			}
		}
		/*
		 * Retorna true se a transação do cliente foi adicionada com sucesso ou false
		 * caso contrário. Verificar se cliente existe (buscarCliente) e se agência
		 * existe (buscarAgencia), não deve incluir transação se cliente ou agência não
		 * existir.
		 */
		return false;
	}

	public boolean listarClientes(String nomeAg, boolean imprimeTran) {
		Agencia agencia = buscarAgencia(nomeAg);
		if (agencia != null) {
			List<Cliente> clientes = agencia.getClientes();
			int i = 0;
			for (Cliente c : clientes) {
				i++;
				System.out.printf("Cliente: %s [%d]", c.getNome(), i);
				System.out.println();
				if (imprimeTran) {
					int j = 0;
					List<Double> transacoes = c.getTransacoes();
					for (Double t : transacoes) {
						j++;
						System.out.printf("  [%d] valor %.2f", j, t);
						System.out.println();
					}
				}
			}

			return true;
		}

		return false;
	}
}
