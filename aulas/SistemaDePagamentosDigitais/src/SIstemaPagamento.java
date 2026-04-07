public class SIstemaPagamento {
    public void realizarPAgamento(MetodoPagamento metodo, double valor){
        metodo.processarPagamento(valor);
    }
}
