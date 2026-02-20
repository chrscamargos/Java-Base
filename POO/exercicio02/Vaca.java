package exercicio02;

public class Vaca {
    public String name;
    private String leite;
    public int filhos;

    public void mugir() {
        IO.println("Muuuhh");
    }

    public int bezerros() {
        filhos = filhos + filhos;
        return filhos;
    }

    public Vaca() {
    }

    public Vaca(String name, String leite, int filhos) {
        this.name = name;
        this.leite = leite;
        this.filhos = filhos;
    }

    @Override
    public String toString() {
        return "Vaca{" +
                "name='" + name + '\'' +
                ", leite='" + leite + '\'' +
                ", filhos=" + filhos +
                '}';
    }
}
