void main(){
    MetodoPagamento Boleto = new Boleto();
    MetodoPagamento Pix = new Pix();
    MetodoPagamento Credito = new CartaoDeCredito();

    Boleto.processarPagamento(100);
    Credito.processarPagamento(100);
    Pix.processarPagamento(150);


}