package es.iespuerto.ets;

public class Restar extends Operacion {
    
    public Restar(){

    }
/**
 * Operacion restar
 * @param numero1 numero 1 que resta
 * @param numero2 numero 2 que resta
 * @param resutado resultado de la operaicon
 * @param operacion operador restar
 */
    public Restar(double numero1, double numero2, double resutado, char operacion) {
        super(numero1, numero2, resutado, operacion);
    }

    /**
     * Se realiza la operacion resta
     * @return el resultado de la resta
     */
    public double restar(){
        return this.resutado = this.numero1 - this.numero2;
    }

}