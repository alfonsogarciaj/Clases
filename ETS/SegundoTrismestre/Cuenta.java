class Cuenta {
    String titular;
    double cantidad;

    public Cuenta() {
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

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

    @Override
    public String toString() {
        return "Cuenta [cantidad=" + cantidad + ", titular=" + titular + "]";
    }

    public boolean ingresar(double n) {
        boolean ingresoOk = true;
        if (n < 0) {
            ingresoOk = false;
        } else {
            cantidad = cantidad + n;
        }
        return ingresoOk;
    }

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
