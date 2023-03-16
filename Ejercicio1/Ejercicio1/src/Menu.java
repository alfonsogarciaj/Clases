import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void MostrarMenu() {
        boolean condicion = true;
        Scanner scanner = new Scanner(System.in);
        while (condicion){
            System.out.println("Introduce el número de la opción a realizar:\n" +
                    "🔹 1. Crear un fichero de texto\n" +
                    "🔹 2. Mostrar el fichero creado\n" +
                    "🔹 3 .Salir del programa");
            int opcion = 0;
            try{
                opcion = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Por favor, asegúrate de introducir valores numéricos");
            }

            switch (opcion) {
                case 1:
                    File f = new File("usuarios.txt");
                    try {
                        FileWriter archivo = new FileWriter(f);
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Introduce tu nombre");
                        String texto = "Nombre: " + br.readLine();
                        System.out.println("Introduce tu edad");
                        texto += "\nEdad: " + br.readLine();
                        System.out.println("Introduce tu ciudad de nacimiento");
                        texto += "\nCiudad de nacimiento: " + br.readLine();
                        archivo.write(texto);
                        archivo.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    File f2 = new File("usuarios.txt");
                    try {
                        FileReader fr = new FileReader(f2);
                        BufferedReader br = new BufferedReader(fr);
                        String linea = "";

                        while((linea = br.readLine())!=null){
                            System.out.println(linea);
                        }
                    } catch (IOException e){
                        e.printStackTrace();
                    }

                    break;

                case 3:
                    System.out.println("Programa terminado");
                    condicion = false;
                    break;
            }
        }
    }
}
