//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Pessoa christian = new Pessoa("christian", "M", 19);
    //christian.idade= 19;
    //christian.sexo= "M";
    //christian.sobrenome= "Rodrigues";

    Pessoa daniel = new Pessoa("daniel", "M", 17);

    // IO.println(christian.idade + " " + christian.sobrenome + " " + christian.sexo);
    IO.println(christian.toString());
    IO.println(daniel.toString());
}
