package aula4;

import java.util.ArrayList;
import java.util.List;

public class Array {
    static void main() {

        List<String> nomes = new ArrayList<>();
        nomes.add("christian");
        nomes.add("guilherme");
        nomes.add("daniel");

        IO.println(nomes);
        IO.println(nomes.get(0));
    }
}
