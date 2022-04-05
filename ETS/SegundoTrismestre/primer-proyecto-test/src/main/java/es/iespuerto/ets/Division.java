package es.iespuerto.ets;

public class Division extends Operacion{


    public Division() {
    }
/**
 * Operacion division
 * @param numero1 numero 1 de la division
 * @param numero2 numero 2 de la division
 * @param resutado resultado de la operacion
 * @param operacion operacion de la division
 */
    public Division(double numero1, double numero2, double resutado, char operacion) {
        super(numero1, numero2, resutado, operacion);
    }


    /**
     * 
     * @return
     */
    public double dividir() throws Exception{

        try{
            this.resutado = this.numero1 / this.numero2;
            return this.resutado;
        }catch(Exception e){
            throw new Exception("Se esta realizando una division por cero");
        }
    }
    

}
