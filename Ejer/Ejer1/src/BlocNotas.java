import java.util.ArrayList;
import java.util.Scanner;

public class BlocNotas {
    Scanner sc = new Scanner(System.in);
    ArrayList<NotaAlarma> misNotas;

    public BlocNotas(){
       misNotas = new ArrayList<>();
    }
    public void introducirNota(){
            System.out.println("Escribe una hora: ");
            String hora = sc.nextLine();
            System.out.println("Escribe una nota: ");
            String nota = sc.nextLine();
            misNotas.add(new NotaAlarma(hora,nota));
    }

    public void listarNotas(){
        for (Nota nota : this.misNotas) {
            System.out.println(nota.toString());
        }
    }

    public void eliminarNotas(){
        System.out.println("Que nota quieres eliminar: ");
        int opcion = sc.nextInt();sc.nextLine();
        misNotas.removeIf(nota -> (nota.getId() == opcion));
        listarNotas();
    }
}
