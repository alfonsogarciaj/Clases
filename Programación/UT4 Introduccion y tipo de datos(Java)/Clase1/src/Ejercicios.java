import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int suma = 0;
        int resta = 0;
        System.out.printf("Introduce 10 numeros: ");
        for (int i = 0; i < array.length; i++) {
            int numero = sc.nextInt();
            array[i] = numero;
        }
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
            resta -= array[i];
        }
        double sumatorio = suma;
        double media = sumatorio/10;
        System.out.println("La suma del array es: " + suma);
        System.out.println("La resta del array es: " + resta);
        System.out.println("La media del array es: " + media);
    }
}
