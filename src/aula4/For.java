package aula4;

public class For {
    static void main() {

//        for (int i = 0; i <= 20; i++) {
//            IO.println("o valor de i é: " + i);
//        }

        //mostrar os numeros pares de 1 a 10:
         for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0){
                IO.println(i + " é par");
            }
//            else {
//                IO.println(i + " é ímpar");
//            }
        }

        // mostrar os numeros impares de 1 a 10:
        for (int i = 1; i <= 10 ; i++) {
            if (i % 2 != 0){
                IO.println(i + " é impar");
            }
        }
    }
}
