abstract class  Personagem {
    private String nome;
    private   int ataque = 10;
    private int defesa = 5;
    private int vida = 100;

    public Personagem(String nome, int ataque, int defesa, int vida) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vida = vida;
    }
    public Personagem(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


    public int atacar(){
        return ataque;
    }
    public void receberDano(int dano){
        vida = vida - dano;
        IO.println("Sua vida atual é: " + vida);
    }
    public void mostrarStatus(){
        IO.println("Vida: " + vida + "| Defesa: " + defesa + "| Ataque: " + ataque);
    }



}
