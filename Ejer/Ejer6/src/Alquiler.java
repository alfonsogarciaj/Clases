public class Alquiler {
    private String nombre;
    private String dni;
    private int diaIni;
    private int diaFin;
    private String posicion;
    private Barco barco;
    public Alquiler(String nombre, String dni, int diaIni, int diaFin, String posicion, Barco barco) {

        this.nombre = nombre;
        this.dni = dni;
        this.diaIni = diaIni;
        this.diaFin = diaFin;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getDiaIni() {
        return diaIni;
    }

    public void setDiaIni(int diaIni) {
        this.diaIni = diaIni;
    }

    public int getDiaFin() {
        return diaFin;
    }

    public void setDiaFin(int diaFin) {
        this.diaFin = diaFin;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", dia=" + diaIni +
                ", mes=" + diaFin +
                ", posicion='" + posicion + '\'' +
                ", barco=" + barco +
                '}';
    }
}
