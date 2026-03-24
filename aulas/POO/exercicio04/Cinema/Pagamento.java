package POO.exercicio04.Cinema;

import java.util.Date;

public class Pagamento {
    private int id;
    private Date horario;
    private Date dia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public String emitirNotaFiscal(){
        String notaFiscal = "Pagamento efeutuado com sucesso";
        return notaFiscal;
    }
}
