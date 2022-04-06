package es.iespuerto.ets;

public class Multiplicacion extends Operacion {
    
    public Multiplicacion(){

    }
/**
 * Operacion multiplicar
 * @param numero1 numero 1 que multiplica
 * @param numero2 numero 2 que multiplica
 * @param resutado resultado de la operaicon
 * @param operacion operador multiplicar
 */
    public Multiplicacion(double numero1, double numero2, double resutado, char operacion) {
        super(numero1, numero2, resutado, operacion);
    }

    /**
     * Se realiza la operacion multiplicar
     * @return el resultado de la multiplicacion
     */
    public double multiplicar(){
        return this.resutado = this.numero1 * this.numero2;
    }

}
