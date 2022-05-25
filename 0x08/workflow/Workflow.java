package workflow;

import java.util.*;

import atividade.Atividade;

public class Workflow {
	List<Atividade> atividades = new ArrayList<Atividade>();
	//protected String texto;


	public void registrarAtividade(Atividade atividade) {
		this.atividades.add(atividade);
		//System.out.println(atividade);teste para ver se esta gravando ok
	}
	
	
	
	public List<Atividade> getAtividades() {
		return atividades;
	}



	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

	
	
}
