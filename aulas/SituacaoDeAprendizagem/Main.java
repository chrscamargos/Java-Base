static void main(){
    Personagem arqueiro = new Arqueiro();
    Personagem guerreiro = new Guerreiro();
    Personagem mago = new Mago();

    mago.setNome("Gandalf");
    arqueiro.setNome("Robin Hood");
    guerreiro.setNome("Spartacus");


    mago.mostrarStatus();

    arqueiro.receberDano(mago.atacar());
    mago.receberDano(arqueiro.atacar());
}