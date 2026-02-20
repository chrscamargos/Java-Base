package exercicio01;

public class animal {
    public String raca;
    public String nome;
    public String cor;
    public int idade;

    public animal (){}

//    public animal (String raca, String nome, String cor, int idade){
//        this.raca = raca;
//        this.nome = nome;
//        this.cor = cor;
//        this.idade = idade;
//    }

    @Override
    public String toString() {
        return "animal{" +
                "raca='" + raca + '\'' +
                ", nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
