package es.iespuerto.refactorizacion;

import java.util.Scanner;

public class Aritmetica {
    static int num1,num2;
    /**
     * Metodo que calcula el minimo comun multiplo
     * @param v1 valor1 sobre el calculo
     * @param v2 valor 2 sobre el calculo
     * @return mcm determinado de los valores dados
     */
    public static int mcm(int v1,int v2){
        int mcm = 1;
        int i=2;
        return (v1*v2)/(mcd(v1,v2));
    }

    /**
     * Metodo que calcula el minimo comun divisor
     * @param v1 valor 1 dado
     * @param v2 valor 2 dado
     * @return mcd determinado de los valores dados
     */
    public static int mcd(int v1, int v2){
        while(v1 != v2) {
            if (v1 > v2)
                v1 = v1 - v2;
            else
                v2 = v2 - v1;

        }
            return v1;
    }

    /**
     * Metodo que obtiene un numero por teclado
     * @return
     */
    public static int obtenerNum(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero=teclado.nextInt();
        return numero;
    }

}
