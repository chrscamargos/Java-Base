public class Mago extends Personagem{

    public Mago(String nome, int ataque, int defesa, int vida) {
        super(nome, ataque, defesa, vida);
    }

    public Mago(){
    }

    public int lancarMagia(){
        return super.atacar() + 15;
    }
    public int atacar() {
        return super.atacar() + 10;
    }

    public void receberDano(int defesa){
        IO.println(getNome() + " foi atacado!");
        defesa = defesa / 2;
    }


}
