package es.iespuerto.refactorizacion;

import java.util.Scanner;

/**
 * @author alfonsogj
 */
public class Nota {
    int nota;

    /**
     * Calificacion alumnos
     * @param args
     */
    public void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Introduzca una nota: ");
        nota = a.nextInt();

        insuficiente(nota);
        suficiente(nota);
        bien(nota);
        notable(nota);
        sobresaliente(nota);
    }


    /**
     * Metodo para nota insuficiente
     * @param nota
     * @return nota
     */
    public Object insuficiente(int nota){
        if(nota>=0 && nota<50) {
            System.out.println("INSUFICIENTE");
        }
        return nota;
    }

    /**
     * Metodo nota suficiente
     * @param nota suficiente
     * @return nota
     */
    public Object suficiente(int nota){
        if (nota>=50 && nota<=59) {
            System.out.println("SUFICIENTE");
        }
        return nota;
    }

    /**
     * Metodo nota bien
     * @param nota bien
     * @return nota
     */
    public Object bien(int nota){
        if(nota>=60 && nota<=69) {
            System.out.println("BIEN");
        }
        return nota;
    }

    /**
     * Metodo nota notable
     * @param nota notable
     * @return nota
     */
    public Object notable(int nota){
        if(nota>=70 && nota<=89) {
            System.out.println("NOTABLE");
        }
        return nota;
    }

    /**
     * Metodo nota sobresaliente
     * @param nota sobresaliente
     * @return nota
     */
    public Object sobresaliente(int nota){
        if(nota>=90 && nota<=100 ) {
            System.out.println("SOBRESALIENTE");
        }
        return nota;
    }
    
}
