
void main() {

    List<Pessoa> banco = new ArrayList<>();
    banco.add(new Pessoa(1, "Igor", 20));
    banco.add(new Pessoa(2, "Camily", 19));
    banco.add(new Pessoa(3, "Gabrielle", 20));
    banco.add(new Pessoa(4, "Alice", 19));
    banco.add(new Pessoa(5, "Guilherme", 17));

    List<Pessoa> cache = new ArrayList<>();

    cache.add(new Pessoa());
    Scanner sc = new Scanner(System.in);
    IO.println("Digite o ID");
    int id = sc.nextInt();
    boolean encontrada = false;

    while (true) {
        for (Pessoa pessoa : cache) {
            if (id == pessoa.getId()) {
                IO.println("Pessoa encontrada no cache: " + pessoa);
                encontrada = true;
            }
        }
        if (!encontrada) {
            for (Pessoa pessoa : banco) {
                if (id == pessoa.getId()) {
                    IO.println("Pessoa buscada no banco e adicionada ao cache" + pessoa);
                    cache.add(pessoa);
                }
            }
        }
        IO.println("Digite outro ID");
        id = sc.nextInt();
    }
}
