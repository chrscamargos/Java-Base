public class CartaoDeDebito extends MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        IO.println("processando pagamento no débito, valor: R$" + valor);
    }
}
