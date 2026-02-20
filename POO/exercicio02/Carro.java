package exercicio02;

public class Carro {
    private String modelo;
    private int velocidade;


    public Carro() {
    }

    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    public void acelerar(double KMH) {
        while (velocidade <= KMH) {
            IO.println("O carro está a " + velocidade + "Km/H");
            velocidade = velocidade++;
            IO.println();
        }
    }
}
