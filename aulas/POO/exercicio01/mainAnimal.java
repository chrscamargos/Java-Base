

import exercicio01.animal;

import java.util.Scanner;

void main() {
    animal gato = new animal();//"cálico", "gizmo", "preto", 4);
    animal cachorro = new animal();
    Scanner sc = new Scanner(System.in);

    IO.println("diga o nome do seu gato:");
    gato.nome = sc.next();

    IO.println("diga a raça do seu gato:");
    gato.raca = sc.next();

    IO.println("diga a cor do seu gato:");
    gato.cor = sc.next();

    IO.println("diga a idade do seu gato:");
    gato.idade = sc.nextInt();
/// /////////////////////////////////////////////////////////////////////////
    IO.println("diga o nome do seu cachorro:");
    cachorro.nome = sc.next();

    IO.println("diga a raça do seu cachorro:");
    cachorro.raca = sc.next();

    IO.println("diga a cor do seu cachorro:");
    cachorro.cor = sc.next();

    IO.println("diga a idade do seu cachorro:");
    cachorro.idade = sc.nextInt();

    IO.println(gato.toString());;
    IO.println(cachorro.toString());

}
