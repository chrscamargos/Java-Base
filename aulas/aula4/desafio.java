package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio {
    static void main() {

        Scanner sc = new Scanner(System.in);
        List<Double> numero = new ArrayList ();

        IO.println("digite um numero: ");
        double numeros = sc.nextDouble();

        numero.add(numeros);

        IO.println("lista" + numero);

        sc.close();

    }
}
