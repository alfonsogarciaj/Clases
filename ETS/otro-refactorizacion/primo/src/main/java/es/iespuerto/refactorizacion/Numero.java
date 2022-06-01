package es.iespuerto.refactorizacion;

public class Numero {
    private static int dimension;
    private static boolean esPrimo[];
    private static int primos[];

    public static int[] primos(int max) {
        int i = 0, j = 0;
        if (max >= 2) {
            int dim = max + 1;
            boolean[] esPrimo = new boolean[dim];
            for (i=0; i<dim; i++)
                esPrimo[i] = true;

            esPrimo[0] = esPrimo[1] = false;

            for (i=2; i<Math.sqrt(dim)+1; i++) {
                if (esPrimo[i]) {
                    for (j=2*i; j<dim; j+=i)
                        esPrimo[j] = false;
                }
            }
            int cuenta = 0;
            for (i=0; i<dim; i++) { if (esPrimo[i]) cuenta++;
            }
            int[] primos = new int[cuenta];
            for (i=0, j=0; i<dim; i++) { if (esPrimo[i])
                primos[j++] = i;
            }
            return primos;
        } else {
            return new int[0];
        }
    }
}
