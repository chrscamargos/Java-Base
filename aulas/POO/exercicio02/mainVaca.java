import exercicio02.Carro;
import exercicio02.Conta;
import exercicio02.Vaca;


void main(){
    Vaca vaca = new Vaca();

    vaca.name = "odete";
    vaca.filhos = 1 ;

    Vaca angus = new Vaca("mimosa", "Qalhada", 7 );
    vaca.mugir();

    Conta contaMu = new Conta();
    contaMu.depositar(1000);

    IO.println(contaMu);

    contaMu.sacar(10000);
    contaMu.sacar(100);

    Carro carro = new Carro("Corsa", 0);
    carro.acelerar(70);


}
