import java.util.*;

public class ListaTodo {

	List<Tarefa> tarefa = new ArrayList<>();

	public ListaTodo() {
		super();
		this.tarefa = tarefa;
	}

	public void adicionarTarefa(Tarefa t) throws Exception {

	      for (Tarefa x : tarefa) {
	            if (x.getIdentificador() == t.getIdentificador())
	                throw new IllegalArgumentException("Tarefa com identificador " + t.getIdentificador() + " ja existente na lista");
	            
	            if (t.getDescricao().equals("") || t.getDescricao().isEmpty() || t.getDescricao().equals(null))
	                throw new IllegalArgumentException("Descricao de tarefa invalida");
	        }  

	      tarefa.add(t);
	}

	public boolean marcarTarefaFeita(int identificador) {
		for (Tarefa x : tarefa) {
			if (x.getIdentificador() == identificador) {
				x.setEstahFeita(true);
				return true;
			}
		}
		return false;
	}

	public void desfazerTodas() {
		for (Tarefa x : tarefa) {
			x.setEstahFeita(false);
		}
	}

	public void fazerTodas() {
		for (Tarefa x : tarefa) {
			x.setEstahFeita(true);
		}
	}

	public void listarTarefas() {
		for (Tarefa x : tarefa) {

			if (x.isEstahFeita() == true) {
				System.out.println("[x]  Id: " + x.getIdentificador() + " - Descricao: " + x.getDescricao());
			} else {
				System.out.println("[ ]  Id: " + x.getIdentificador() + " - Descricao: " + x.getDescricao());
			}
		}
	}

	public boolean desfazerTarefa(int identifica) {
		for (Tarefa x : tarefa) {
			if (x.getIdentificador() == identifica) {
				x.setEstahFeita(false);
				return true;
			}
		}
		return false;
	}

}
