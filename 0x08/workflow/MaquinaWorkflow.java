

import java.util.*;

import atividades.Atividade;

public class MaquinaWorkflow{
	
	List<Atividade> atividades = new ArrayList<Atividade>();
	
	//protected Atividade atividades;
	
	public void executar(Workflow workflow) {
		//itera sobre cada atividade contido no workflow e os executam em sequência.
		for(Atividade atividade : workflow.getAtividades()) {
			atividade.executar();
		}
	}
	
}
