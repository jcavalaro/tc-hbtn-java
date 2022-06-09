import java.util.*;

public class ConsultaProdutos {

	public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro crit) {
		//filtrar pela criterio e retornar uma lista de produtos filtrados pelo criterio passado
		//deve percorrer a lista de produto e retornar apenas produtos onde testar retorne true
		List<Produto> p = new ArrayList<>();
		for(Produto s: produtos) {
			 
			 if(crit.testar(s)) {
				 p.add(s);		 
			 }
		}
		
		return p;
		
	}
	
}
