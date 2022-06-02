import java.util.*;

public class ListaTelefonica {

	Map<String, ArrayList<Telefone>> contatos;

	public ListaTelefonica() {

		this.contatos = new HashMap<>(); // inicializar
	}

	public void adicionarTelefone(String nome, Telefone telefoneAdd) {// recebe um nome e um telefone
		ArrayList<Telefone> telefones;
		if (buscar(nome) == null) {
			telefones = new ArrayList<>();
			telefones.add(telefoneAdd);
			contatos.put(nome, telefones);
		} else {
			contatos.get(nome).add(telefoneAdd);
		}

	}

	public ArrayList<Telefone> buscar(String nomeBusca) {

		// preciso pegar o nomeBusca e verificar na minha lista hashmap se a pessoa
		// existe , se existir busca, se n existir null

		for (String chave : contatos.keySet()) { // retorna todas s minhas chaves
			if (nomeBusca.equals(chave)) {
				return contatos.get(chave); //retorna todo o  arrray list associado a uma chave
			}
		}
		return null;
		/*
		 * Crie o método buscar que recebe um nome e retorne ArrayList<Telefone>
		 * contendo os telefones da pessoa. Se não houver a pessoa na lista, retorn
		 * null.
		 */
	}

}
