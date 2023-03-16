
public class NotaAlarma extends Nota{
    private String hora;

    public NotaAlarma(String hora, String Nota) {
        super(Nota);
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    public String setHora(String hora) {
        this.hora = hora;
        return hora;
    }

    @Override
    public String toString() {
        return "NotaAlarma{" +
                "hora='" + hora + '\'' +
                ", nota='" + getNota() + '\'' +
                ", id=" + getId() +'}';
    }
}
