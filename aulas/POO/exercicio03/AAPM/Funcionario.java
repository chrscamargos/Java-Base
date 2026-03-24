package POO.exercicio03.AAPM;

public class Funcionario {
    private String nome;
    private long cpf;
    private String email;
    private long fone;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getFone() {
        return fone;
    }

    public void setFone(long fone) {
        this.fone = fone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String virarSocio(){
        String cadastro = nome + " " + cpf + " " + email + " " +  fone;
        return "cadastro efetuado! " + cadastro;
    }
}
