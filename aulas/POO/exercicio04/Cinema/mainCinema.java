package POO.exercicio04.Cinema;



public class mainCinema {
   public static void main(){
       Cliente cliente = new Cliente();

       cliente.setNome("christian");
       cliente.setCpf(12345678901L);
       cliente.comprarIngresso();
       cliente.comprarPipoca();

       Pagamento pagamento = new Pagamento();

       pagamento.emitirNotaFiscal();

       IO.println(cliente);
   }
}
