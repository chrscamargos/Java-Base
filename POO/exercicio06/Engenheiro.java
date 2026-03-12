public class Engenheiro extends Funcionario {
    private String numCrea;

    public Engenheiro() {}

    public Engenheiro(String nome, String rg, Double salario, String numCrea) {
        super(nome, rg, salario);
        this.numCrea = numCrea;
    }

    public String getNumCrea() {
        return numCrea;
    }

    public void setNumCrea(String numCrea) {
        this.numCrea = numCrea;
    }

    @Override
    public double calcularSalario(double valor) {
        return valor - (valor * 0.27);
    }
}
