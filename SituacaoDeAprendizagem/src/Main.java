static void main(){
    Personagem arqueiro = new Arqueiro();
    Personagem guerreiro = new Guerreiro();
    Personagem mago = new Mago();

    mago.mostrarStatus();

    arqueiro.receberDano(mago.atacar());
    mago.receberDano(arqueiro.atacar());
}