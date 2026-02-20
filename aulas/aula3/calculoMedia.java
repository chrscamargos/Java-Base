package aula3;

import java.util.Scanner;

public class calculoMedia {
    static  void main (){
        Scanner media = new Scanner(System.in);

        IO.println("insira sua primeira nota: ");
        double nota = media.nextDouble();
        IO.println("insira sua segunda nota: ");
        double nota2 = media.nextDouble();
        IO.println("insira sua terceira nota: ");
        double nota3 = media.nextDouble();

        double mediaGeral = (nota + nota2 + nota3) / 3;

        if (mediaGeral < 4){
            IO.println("reprovado, sua média foi: " + mediaGeral);
        } else if (mediaGeral <= 6) {
            IO.println("recuperação, sua média foi: " + mediaGeral);
        } else  {
            IO.println("aprovado, sua média foi: "+ mediaGeral);
        }

    }
}
