package es.iespuerto.refactorizacion;

public class Bank {

    public Money exchange(Money dinero, String moneda) {
        int cantidad = 0;
        cantidad = dinero.getCantidad();
        if (dinero.getMoneda().equals("EUR")
                && moneda.equals("USD")) {
            cantidad = cambio(130, dinero.getCantidad(), 100);
        } else if (dinero.getMoneda().equals("USD")
                && moneda.equals("EUR")) {
            cantidad = cambio(100, dinero.getCantidad(), 130);
        }
        return new Money(cantidad, moneda);
    }

    public static int cambio(int valorInicial, int cantidad, int cambio){

        return (valorInicial * cantidad)/cambio;

    }
}
