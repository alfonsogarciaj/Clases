import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temperatura = new int[6];
        int[] dias = new int[6];
        int cantDias = 0;
        int i = 0;
        int suma = 0;
        int tempMax  = temperatura[0];
        int tempMin= temperatura[0];
        do {
            System.out.println("Diga un dia: ");
            int dia = sc.nextInt();
            sc.nextLine();
            dias[i] = dia;
            System.out.println("Diga una temperatura: ");
            int tiempo = sc.nextInt();
            sc.nextLine();
            temperatura[i] = tiempo;
            i++;
            cantDias++;
        }while (cantDias<5);
        for (i = 0; i < cantDias; i++) {
            suma = suma + dias[i];
            if(temperatura[i]>tempMax){
                tempMax = temperatura[i];
            }
            if (temperatura[i]<tempMin){
                tempMin = temperatura[i];
            }
            System.out.println("El dia " + dias[i] + " con " + temperatura[i] + " grados.");
        }
        int media = suma / temperatura.length;
        System.out.println("La media de temperatura es: " + media);
        System.out.println("La temperatura mas alta es: " + tempMax);
        System.out.println("La temperatura mas baja es: " + tempMin);
    }
}
