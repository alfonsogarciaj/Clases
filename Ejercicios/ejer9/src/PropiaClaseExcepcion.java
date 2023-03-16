class MiExcepcion extends Exception {
    String mensaje;
    public MiExcepcion(String mensaje) {
        this.mensaje = mensaje;
    }
    public String getMensaje() {
        return mensaje;
    }
}
public class PropiaClaseExcepcion {
    public static void main(String[] args) {
        try {
            throw new MiExcepcion("Esta es mi propia Excepción");
        } catch(MiExcepcion e) {
            System.out.println("Excepción: " + e.getMensaje());
        }
    }
}