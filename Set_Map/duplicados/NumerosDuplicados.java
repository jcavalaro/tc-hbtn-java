

import java.util.*;


public class NumerosDuplicados {

	public static TreeSet<Integer> buscar(int[] numeroUsuario) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		Set<Integer> numeroRepetido = new HashSet<Integer>();

		//quero colocar em ordem
		//retornar numeros repetidos
		//return tree set
		
		List<Integer> list = new ArrayList<>();
		
		for (int iteraNumeroUsuario : numeroUsuario) { //pegando o contator e passando por toda lista do usuario
			if (numeroRepetido.contains(iteraNumeroUsuario)) { //se ele ja contem o meu contador ou n
				treeSet.add(iteraNumeroUsuario); //se ele tiver vai add no meu treeset, ordenando
			}
			numeroRepetido.add(iteraNumeroUsuario);//sempre vai ser add ao final, ver se o numero é repetido
		}
		return treeSet;
	}
}

/* MAIS EXPLICITO - CONSTRUCAO
 * 		for(int contador : numeroUsuario) {
			list.add(contador);
		}
		
		Set<Integer> set = new TreeSet<Integer>(list); //passando a list para set - ordenando e removendo os repetidos

		for(Integer numerosUnicos: set) {
			int cont = 0;
			
			for(int nTotal : numeroUsuario) {
				
				if(numerosUnicos == nTotal) {
					cont ++;
				}
			}
			if(cont >1) 
				treeSet.add(numerosUnicos);
		}
 * */
