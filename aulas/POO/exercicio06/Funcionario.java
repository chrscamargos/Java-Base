package POO.exercicio06;

public abstract class Funcionario {
    private String nome;
    private String rg;
    private Double salario;

    public Funcionario(){}

    public Funcionario(String nome, String rg, Double salario) {
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Double getSalario() {
        return salario;
    }

   public abstract double calcularSalario(double valor);

    public void trabalhar(){}
}
