package es.iespuerto.refactorizacion;

public class Bank {

    public Money exchange(Money dinero, String moneda) {
        int cantidad = 0;

        if (dinero.getMoneda().equals(moneda)) {
            cantidad = dinero.getCantidad();
        } else if (dinero.getMoneda().equals("EUR")
                && moneda.equals("USD")) {
            cantidad = (130 * dinero.getCantidad()) / 100;
        } else if (dinero.getMoneda().equals("USD")
                && moneda.equals("EUR")) {
            cantidad = (100 * dinero.getCantidad()) / 130;
        }
        return new Money(cantidad, moneda);
    }

}
