public class Farmaceutico extends Funcionario {
    private String numCrf;

    public Farmaceutico() {}

    public Farmaceutico(String nome, String rg, Double salario, String numCrf) {
        super(nome, rg, salario);
        this.numCrf = numCrf;
    }

    public String getNumCrf() {
        return numCrf;
    }

    public void setNumCrf(String numCrf) {
        this.numCrf = numCrf;
    }

    @Override
    public double calcularSalario(double valor) {
        return valor - (valor * 0.15);
    }
}
