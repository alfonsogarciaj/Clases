public abstract class Producto {
    private String titulo;
    private float precio;
    static int cid = 1;
    private final int id;

    public Producto(String titulo, float precio) {
        this.titulo = titulo;
        this.precio = precio;
        this.id = cid;
        cid++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public static int getCid() {
        return cid;
    }

    public static void setCid(int cid) {
        Producto.cid = cid;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", id=" + id +
                '}';
    }
}
