
import java.util.List;

public class ManipularArrayNumeros {

	public static int buscarPosicaoNumero(List<Integer> numeros, int n) {
		return numeros.indexOf(n); // aqui ele vai localizar a primeira ocorrencia da sequencia da lista, quando
									// ele n encontrar ele retorna -1
	}

	public static void adicionarNumero(List<Integer> numeros, int n) throws Exception {
		if (buscarPosicaoNumero(numeros, n) == -1) {
			numeros.add(n);
		} else {
			throw new Exception("Numero jah contido na lista");
		}

	}

	public static void removerNumero(List<Integer> numeros, int n) throws Exception {
		if(buscarPosicaoNumero(numeros, n) == -1) {
			
			throw new Exception("Numero nao encontrado na lista");
		}else {
			numeros.remove(buscarPosicaoNumero(numeros, n));
		}
	}

	public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
		if(buscarPosicaoNumero(numeros, numeroSubstituir) != -1) {
			numeros.set(buscarPosicaoNumero(numeros, numeroSubstituir), numeroSubstituto);
		}else {
			numeros.add(numeroSubstituto);
		}
	}

	
}
