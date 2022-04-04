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
     * Constructor con dos paremetros
     * @param numero1 Numero 1 de la operacion
     * @param numero2 Numero 2 de la operacion
     */
    public Operacion(double numero1, double numero2){
        
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    /**
     * Constructor con tres parametros
     * @param numero1 Numero 1 de la operacion
     * @param numero2 Numero 2 de la operacion
     * @param operacion Operacion que se ejecuta
     */
    public Operacion(double numero1, double numero2, char operacion) {
        
        this.numero1 = numero1;
        this.numero2 = numero2;
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
}
