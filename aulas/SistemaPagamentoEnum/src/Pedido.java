public class Pedido {
    private int id;
    private String cliente;
    private StatusPedido status;

    public Pedido() {
    }

    public Pedido(int id, String cliente, StatusPedido status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void avancarStatus(Pedido pedido){

//        for (int i = 0; i < 1; i++){
//            for(StatusPedido status : StatusPedido.values()){
//                IO.println(status);
//            }
//        }

        IO.println("status do pedido:");
        if (StatusPedido.AGUARDANDO_PAGAMENTO == pedido.getStatus()) {
            status = StatusPedido.PROCESSANDO;
        } else if (StatusPedido.PROCESSANDO == pedido.getStatus()) {
            status = StatusPedido.ENVIADO;
        } else if (StatusPedido.ENVIADO == pedido.getStatus()) {
            status = StatusPedido.ENTREGUE;
        } else  {
            IO.println("o status não pode ser alerado");
        }
    }

    public void cancelarPedido(){
        if (status != StatusPedido.ENTREGUE) {
            status = StatusPedido.CANCELADO;
        } else {
            System.out.println("Erro: Não é possível cancelar um pedido já entregue.");
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", status=" + status +
                '}';
    }
}
