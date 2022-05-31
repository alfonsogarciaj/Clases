package es.iespuerto.refactorizacion;

import java.util.Scanner;

public class Mcm_Mcd extends Aritmetica {
    public static void main(String[] args) {
        int mcm,mcd;
        num1 = obtenerNum();
        num2 = obtenerNum();
        mcm = mcm(num1, num2);
        mcd = mcd(num1, num2);
        System.out.println("El MCM es =" +mcm);
        System.out.println("El MCD es =" +mcd);
    }

}
