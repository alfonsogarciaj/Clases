import java.util.Scanner;
import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BlocNotas misBlocNotas = new BlocNotas();
        
        boolean condicion = true;
        while (condicion){
            misBlocNotas.introducirNota();
            System.out.println("Quieres continuar? si/no");
            String respuesta = sc.nextLine();
            if(respuesta.equals("no")){
                condicion = false;
            }
        }
        misBlocNotas.listarNotas();
        misBlocNotas.eliminarNotas();
    }
}