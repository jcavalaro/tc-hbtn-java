import java.util.*;

public class Celular {

	List<Contato> contatos = new ArrayList<>();

	public int obterPosicaoContato(String nomeDoContato) {
		for (Contato x : this.contatos) {
			if (x.getNome().equals(nomeDoContato)) {
				return contatos.indexOf(x);
			}
		}
		return -1;
	}

	public void adicionarContato(Contato c) throws Exception {
		if (obterPosicaoContato(c.getNome()) != -1) {
			throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
		} else {
			this.contatos.add(c);
		}
	}

	public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws Exception {
		if (obterPosicaoContato(contatoAntigo.getNome()) == -1) {
			throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
		} else if (obterPosicaoContato(novoContato.getNome()) != -1
				&& obterPosicaoContato(novoContato.getNome()) != obterPosicaoContato(contatoAntigo.getNome())) {
			throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
		}
		contatos.set(obterPosicaoContato(contatoAntigo.getNome()), novoContato);
	}

	public void listarContatos() {
		for (Contato x : contatos) {
			System.out.println(x.getNome() + " -> " + x.getNumero() + " (" + x.getTipo() + ")");
		}
	}

	public void removerContato(Contato c) throws Exception {
		if (obterPosicaoContato(c.getNome()) == -1) {

			throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
		} else {
			contatos.remove(obterPosicaoContato(c.getNome()));
		}

	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contato) {
		this.contatos = contato;
	}

}
