package es.iespuerto.ets;

public class Sumar extends Operacion {
    
    public Sumar(){

    }
/**
 * Operacion sumar
 * @param numero1 numero 1 que suma
 * @param numero2 numero 2 que suma
 * @param resutado resultado de la operaicon
 * @param operacion operador sumar
 */
    public Sumar(double numero1, double numero2, double resutado, char operacion) {
        super(numero1, numero2, resutado, operacion);
    }

    /**
     * Se realiza la operacion suma
     * @return el resultado de la suma
     */
    public double sumar(){
        return this.resutado = this.numero1 + this.numero2;
    }

}