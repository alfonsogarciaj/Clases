public class Nota {
    static int cid = 1;
    private String nota;

    private final int id;

    public Nota(String nota) {
        this.nota = nota;
        this.id = cid;
        cid++;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public static int getCid() {
        return cid;
    }

    public static void setCid(int cid) {
        Nota.cid = cid;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nota='" + nota + '\'' +
                ", id=" + id +
                '}';
    }
}
