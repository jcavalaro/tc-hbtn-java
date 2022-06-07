import java.util.Objects;

public class Autor implements Comparable<Autor>{
	private String nome, sobrenome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	
	public Autor(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return nome+" "+sobrenome;
	}

	@Override
	public int compareTo(Autor outroAutor) {
		return this.toString().compareTo(outroAutor.toString());
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, sobrenome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(sobrenome, other.sobrenome);
	}
	
	
}
