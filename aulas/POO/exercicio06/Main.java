import POO.exercicio06.Engenheiro;
import POO.exercicio06.Farmaceutico;
import POO.exercicio06.Funcionario;

void main(){

    Funcionario farmaceutico = new Farmaceutico();
    IO.println(farmaceutico.calcularSalario(7000));

    Engenheiro engenheiro = new Engenheiro();
    IO.println(engenheiro.calcularSalario(10000));

}