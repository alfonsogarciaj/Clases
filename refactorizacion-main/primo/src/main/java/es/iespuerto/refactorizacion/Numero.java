package es.iespuerto.refactorizacion;

public class Numero {
    private int dim;
    private boolean esPrimo[];
    private int primos[];


    public void allTrue(){
        for (int i=0; i<dim; i++){
            esPrimo[i] = true;
        }
    }

    public void comprobar(){
        for (int i=2; i<Math.sqrt(dim)+1; i++) {
            if (esPrimo[i]) {
                for (int j=2*i; j<dim; j+=i)
                    esPrimo[j] = false;
            }
        }
    }

    public int cuenta(){
        int cuenta = 0;
        for (int i=0; i<dim; i++) { 
            if (esPrimo[i]) 
            cuenta++;
        }
        return cuenta;
    }

    public void contador(){
        for (int i=0, j=0; i<dim; i++) { 
            if (esPrimo[i])
            primos[j++] = i;
        }
    }

    public int[] primos(int max) {
        if (max >= 2) {
            dim = max + 1;
            esPrimo = new boolean[dim];
            
            allTrue();

            esPrimo[0] = esPrimo[1] = false;

            comprobar();

            int cuenta = cuenta();

            primos = new int[cuenta];

            contador();

            return primos;
        } else {
            return new int[0];
        }
    }
}
