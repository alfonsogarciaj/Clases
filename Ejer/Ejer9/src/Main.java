public class Main implements regVehicular{
    public static void main(String[] args) {
        Propietario propietario = new Propietario("343454g","Pedro","Calle Torres","6435663556");
        Automovil automovil = new Automovil();
        Vehiculo vehiculo = new Vehiculo();
    }

    @Override
    public double pagoTramite() {
        return 0;
    }

    @Override
    public String obtenerCve() {
        return null;
    }
}