import java.util.*;

public class AnalisadorFrase {

	public static TreeMap<String, Integer> contagemPalavras(String frase) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		ArrayList<String> array = new ArrayList<>();
		
		// tratando os caracteres especiais
		frase = frase.replace("?", "");
		frase = frase.replace("!", "");
		frase = frase.replace(".", "");

		String[] frases = frase.split(" "); // split, estou falando que quero buscar strings separadas por espaco
		for (String x : frases) {
			// veja, aqui eu estou pegando palavra por palavra e adicionando em um array[]
			array.add(x.toLowerCase()); // aqui estou ignorando se eh maisculo ou minusculo
		}
		Collections.sort(array); //coloquei os arrays em ordem alfabetica (ordenei pela chave, nesse caso, a chave é string, então ordena em ordem alfabetica
		// agora que separamos as palavras e as adicionamos em um array, precisamos
		// contabilizar quantas vezes as palavras se repetem
		
		 for (int i = 0; i < array.size(); i++) {
			
	            String palavra = array.get(i);
	            
	            int frequenciaDaPalavra = Collections.frequency(array, palavra); //dentro do array, qts vezes a palavra se repete?
	       
	            treeMap.put(palavra, frequenciaDaPalavra);
	        }
		
		return treeMap;
	}
}

// retorna um treemap - ok
// os elementos tem q ficar ordenado pela chave -ok
// com cada uma das palavras como chave - ok
//e a quantidade de suas ocorrencias na -ok
// frase.

// a contagem n deve ser case sensitive -ok
// tratar caracter especial ?!. - ok