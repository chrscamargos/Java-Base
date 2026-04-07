public class Pix extends MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        IO.println("Processando tranferência via pix no valor de R$" + valor);
    }
}
