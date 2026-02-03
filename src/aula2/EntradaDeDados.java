package aula2;

import java.util.Scanner;

public class EntradaDeDados {
    static void main(){

    Scanner sc = new Scanner(System.in);

    IO.println("inisira seu nome");
    String nome = sc.next();

    IO.println("insira seu peso");
    double peso = sc.nextDouble();

    IO.println("qual sua altura");
    double altura = sc.nextDouble();

    IO.println("quantos anos você tem");
    int idade = sc.nextInt();

    double imc = peso / (altura * altura);

    IO.println("seu nome é " + nome + ", sua idade é " + idade + ", e seu IMC é " + imc);
    //IO.println(nome);
    }
}
