package AAPM;

public class mainAAPM {
    static void main(){
        Aluno aluno = new Aluno();

        aluno.setNome("christian");
        aluno.setCpf(53383046869L);
        aluno.setEmail("christianrodriguesdc2501@gmail.com");
        aluno.setIdade(19);
        aluno.setId(1);
        aluno.setFone(11946343390L);
        aluno.setRa("123456789");

        Funcionario funcionario = new Funcionario();

        funcionario.setCpf(1234567890L);
        funcionario.setEmail("jorge@gmail.com");
        funcionario.setFone(1198765432L);
        funcionario.setId(1);
        funcionario.setNome("camargo");

        IO.println(aluno.virarSocio());
        IO.println(funcionario.virarSocio());

    }
}
