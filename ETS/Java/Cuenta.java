/**
 * Clase que representa la cuenta de un usuario siendo titular
 * y la cantidad que dispone en su cuenta
 * 
 * @version 0.5, 13/02/2022
 * @author alfonsoGJ
 */
class Cuenta {
    String titular; // Titular de la cuenta
    double cantidad; // Cantidad de dinero que dispone

    /**
     * Constructor por defecto
     */
    public Cuenta() {
    }

    /**
     * Constructor cuenta
     * 
     * @param titular  del titular de la cuenta
     * @param cantidad que dispone el titular
     */
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    /**
     * Se generan los gets del titular y cantidad
     * 
     * @return titular y cantidad
     */

    /**
     * Se generan los sets del titular y cantidad
     * 
     * @param titular;
     * @param cantidad;
     */
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Se genera toString para que nos imprima
     * el titular y su cantidad
     */
    @Override
    public String toString() {
        return "Cuenta [cantidad=" + cantidad + ", titular=" + titular + "]";
    }

    /**
     * Se genera metodo ingresar
     * siento n la cantidad que desea ingresar.
     * Es un boolean que nos da el Ok si el ingreso
     * se ha hecho efectivo
     * 
     * @param n
     * @return ingresoOk
     */
    public boolean ingresar(double n) {
        boolean ingresoOk = true;
        if (n < 0) {
            ingresoOk = false;
        } else {
            cantidad = cantidad + n;
        }
        return ingresoOk;
    }

    /**
     * Se genera metodo retirar
     * siendo n la cantidad que desea retirar.
     * Es un boolean que nos da el Ok si es posible la retirada
     * Si tiene el dinero suficiente para poder retirar y cuanto
     * le quedaria despues de retirar la cantidad
     * 
     * @param n
     * @return retirarOk
     */
    public boolean retirar(double n) {
        boolean retirarOk = true;
        if (n < 0) {
            retirarOk = false;
        } else if (cantidad >= n) {
            cantidad -= n;
        } else if (cantidad > n) {
            cantidad = 0;
        }
        return retirarOk;
    }

}
