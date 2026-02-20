package aula4;

public class While {
    static void main() {
        int par = 0;
        int impar = 1;

        while (par <= 10) {
            IO.println(par + " é par");
            par += 2;
        }
        while (impar <= 10) {
            IO.println(impar + " é ímpar");
            impar += 2;
        }
    }
}
