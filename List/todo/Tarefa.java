
public class Tarefa {
	private String descricao;
	private boolean estahFeita;
	private int identificador;

	public void modificarDesricao(String novaDescricao) throws Exception {
		// modifica a descricao da tarefa
		// Não pode ser nula nem string vazia, senão lance uma exceção com a mensagem
		// Descricao de tarefa invalida

		if (novaDescricao.equals("") || novaDescricao.isEmpty() || novaDescricao.equals(null)) {
			throw new IllegalArgumentException("Descricao de tarefa invalida");
		} else {
			this.descricao = novaDescricao;

		}
	}

	public Tarefa(String descricao, int identificador) {
		super();
		this.descricao = descricao;
		this.identificador = identificador;
	}

	public Tarefa(String descricao, boolean estahFeita, int identificador) {
		super();
		this.descricao = descricao;
		this.estahFeita = estahFeita;
		this.identificador = identificador;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isEstahFeita() {
		return estahFeita;
	}

	public void setEstahFeita(boolean estahFeita) {
		this.estahFeita = estahFeita;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

}
