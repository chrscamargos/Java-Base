package Animal;

public class MainAnimal {
    public void main(){
        Animal vaca = new Vaca();
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        gato.setNome("Gizmo");
        gato.setCor("Cinza");
        gato.setPeso(4.5);

        vaca.setNome("Mimosa");
        vaca.setCor("Branco com manchas pretas");
        vaca.setPeso(550);

        cachorro.setNome("Pedro");
        cachorro.setCor("Maarrom");
        cachorro.setPeso(5);

        IO.println(cachorro.fazerSom());
        IO.println(gato.fazerSom());
        IO.println(vaca.fazerSom());
    }
}
