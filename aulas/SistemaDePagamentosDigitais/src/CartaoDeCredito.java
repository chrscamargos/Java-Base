public class CartaoDeCredito extends MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        IO.println("processando pagamento no crédito, valor: R$" + valor);
    }
}
