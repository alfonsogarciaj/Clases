import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vector1 = new int [5];
        int [] vector2 = new int [5];
        int [] vector3 = new int [5];
        System.out.println("Primer Vector");
        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese un valor para el primer vector: ");
            int num = sc.nextInt();sc.nextLine();
            vector1[i] = num;
        }
        System.out.println("Segundo Vector");
        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese un valor para el segundo vector: ");
            int num = sc.nextInt();sc.nextLine();
            vector2[i] = num;
        }
        for(int i = 0; i < 5; i++){
            vector3[i] = vector1[i] + vector2[i];
        }
        System.out.println("El tercer vector de la suma del 1 y del es de:");
        for (int i = 0; i < vector3.length; i++) {
            System.out.println(vector3[i]);
        }

    }
}
