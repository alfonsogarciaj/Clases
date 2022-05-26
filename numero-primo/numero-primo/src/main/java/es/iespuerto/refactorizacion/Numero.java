package es.iespuerto.refactorizacion;

/**
 * @author alfonsogj
 */
public class Numero {
    private static int dimension;
    private static boolean esPrimo[];
    private static int primos[];

    public static int[] primos(int max) {
        int i = 0, j = 0;
        int dim = 0;
        if (max >= 2) {
            esMaximo(max);
            esPrimo[0] = esPrimo[1] = false;
            calculoPrimo(dim);
            int cuenta = 0;
            cuenta(dim);
            int[] primos = new int[cuenta];
            meterPrimos(dim);
            return primos;

        } else {
            return new int[0];
        }
    }

    /**
     * Metodo para crear la cuenta de num primos
     * @param dim
     * @return cuenta
     */
    public static int cuenta(int dim){
        int cuenta = 0;
        for ( int i = 0; i < dim; i++) {
            if (esPrimo[i]) cuenta++;
        }
        return cuenta;
    }

    /**
     *Metodos para introducir los primos
     * @param dim
     * @return primos
     */
    public static int[] meterPrimos(int dim){
        int i;
        int j;
        for (i = 0, j = 0; i < dim; i++) {
            if (esPrimo[i])
                primos[j++] = i;
        }
        return primos;
    }

    /**
     * metodo para culcular el primo
     * @param dim
     */
    public static void calculoPrimo(int dim){
        int i;
        int j = 0;
        for (i = 2; i < Math.sqrt(dim) + 1; i++) {
            if (esPrimo[i]) {
                for (j = 2 * i; j < dim; j += i)
                    esPrimo[j] = false;
            }
        }
    }

    /**
     * metodo para saber la dimension del array
     * @param max
     */
    public static void esMaximo(int max) {
            int dim = max + 1;
            boolean[] esPrimo = new boolean[dim];
            int i;
            for (i = 0; i < dim; i++)
                esPrimo[i] = true;
    }
}