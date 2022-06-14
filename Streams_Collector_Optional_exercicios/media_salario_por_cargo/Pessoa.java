public class Pessoa implements Comparable{
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;



    @Override
    public String toString() {
        return String.format("[%d] %s %s %d R$ %.2f", codigo,nome,cargo,idade,salario);
    }

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public int compareTo(Object o) {
        Pessoa p = (Pessoa)o;
        return this.nome.compareTo(p.getNome());

    }
}
