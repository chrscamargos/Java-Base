public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int ataque, int defesa, int vida) {
        super(nome, ataque, defesa, vida);
    }

    public Guerreiro() {
    }

    public void receberDano(int defesa){
        IO.println(getNome() + " foi atacado!");
        defesa = defesa * 2;
    }
}
