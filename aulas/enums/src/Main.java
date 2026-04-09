void main(){
    DiaDaSemana hoje = DiaDaSemana.QUINTA;
    IO.println("hoje é: " + hoje);

    Pedido pedido = new Pedido(1, "bixofis", Status.AGUARDANDO_PAGAMENTO);
    IO.println(pedido.toString());
}