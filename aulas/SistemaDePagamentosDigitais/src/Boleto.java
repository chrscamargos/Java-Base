public class Boleto extends MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        IO.println("gerando boleto no valor de: R$" + valor + ", será pago em até 3 dias utéis");
    }
}
