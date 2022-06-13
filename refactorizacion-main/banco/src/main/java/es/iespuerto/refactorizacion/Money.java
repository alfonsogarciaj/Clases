package es.iespuerto.refactorizacion;

public class Money {
    private int cantidad;
    private String moneda;

    public Money(int cantidad, String moneda) {
        this.cantidad = cantidad;
        this.moneda = moneda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getMoneda() {
        return moneda;
    }

}
