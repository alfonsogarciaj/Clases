import java.util.Date;

public class Docente {
    private String rfc;
    private Date date;
    private CVitae experiencia;

    public Docente(String rfc, Date date, CVitae experiencia) {
        this.rfc = rfc;
        this.date = date;
        this.experiencia = experiencia;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CVitae getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(CVitae experiencia) {
        this.experiencia = experiencia;
    }


}
