public class Arqueiro extends Personagem {
    public Arqueiro(String nome, int ataque, int defesa, int vida) {
        super(nome, ataque, defesa, vida);
    }

    public Arqueiro() {
    }

    public void atacar(int ataque) {
        ataque = ataque * 2;
    }

    public void disparoPreciso() {

    }

    public void receberDano(int defesa) {

        IO.println("seu arqueiro foi atacado!");
        super.receberDano(defesa);
    }
}
