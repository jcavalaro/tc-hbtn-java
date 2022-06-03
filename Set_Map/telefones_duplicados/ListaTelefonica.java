import java.util.*;

public class ListaTelefonica {

	Map<String, HashSet<Telefone>> contatos;

	public ListaTelefonica() {

		this.contatos = new HashMap<>(); // inicializar
	}

	public HashSet<Telefone> adicionarTelefone(String nomeDoContatoAdicionado, Telefone telefoneAdd) {// recebe um nome
																										// e um telefone
		HashSet<Telefone> telefones = new HashSet<Telefone>();
		
		try {
			if (buscar(nomeDoContatoAdicionado) != null) { //objeto existe
				
				if(contatos.get(nomeDoContatoAdicionado).contains(telefoneAdd))  //relacionado ao contato tem o telefone
					throw new Exception("Telefone jah existente para essa pessoa");
				
				for(String chave : contatos.keySet()) {
					contatos.get(chave).contains(telefoneAdd);
					if(contatos.get(chave).contains(telefoneAdd)) 
						throw new Exception("Telefone jah pertence a outra pessoa");
				}
				contatos.get(nomeDoContatoAdicionado).add(telefoneAdd);
			}
			
			else {
				telefones.add(telefoneAdd); //criando estrutura
				contatos.put(nomeDoContatoAdicionado, telefones);
				
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}

		return contatos.get(nomeDoContatoAdicionado);
		
	}

	public HashSet<Telefone> buscar(String nomeBusca) {

		// preciso pegar o nomeBusca e verificar na minha lista hashmap se a pessoa
		// existe , se existir busca, se n existir null

		for (String chave : contatos.keySet()) { // retorna todas s minhas chaves
			if (nomeBusca.equals(chave)) {

				return contatos.get(chave); // retorna todo o arrray list associado a uma chave
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
