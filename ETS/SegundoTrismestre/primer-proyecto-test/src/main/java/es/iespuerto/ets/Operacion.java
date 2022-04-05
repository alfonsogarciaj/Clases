package es.iespuerto.ets;

public class Operacion {
    double numero1;
    double numero2;
    double resutado;
    char operacion;

    /**
     * Constructor por defecto
     */
    public Operacion(){}

    /**
     * Constructor con todos los parametros
     * @param numero1 n1 de la operacion
     * @param numero2 n2 de la operacion
     * @param resutado resultado de la operacion
     * @param operacion 
     */
    public Operacion(double numero1, double numero2, double resutado, char operacion) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resutado = resutado;
        this.operacion = operacion;
    }

    /**
     * Nos devuelve el resultado
     */
    @Override
    public String toString() {
        return "Operacion [numero1=" + numero1 + ", operacion=" + operacion + ", numero2=" + numero2 +  ", resutado="
                + resutado + "]";
    }

    public void mostrarResultado(){
        
        System.out.println(this.numero1+" "+this.operacion+" "+this.numero2+" = "+this.resutado);
        
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public double getResutado() {
        return resutado;
    }

    public char getOperacion() {
        return operacion;
    }


}
