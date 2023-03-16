import java.io.*;
import java.util.Scanner;

public class Menu {

    public static void menu() {
        boolean condicion = true;
        String nombreArchivo = null;

        while (condicion) {

            System.out.println("Elige una opción de entre las siguientes: \n" +
                    "🔹 1- Volcar los 100 primeros números pares en un archivo .txt\n" +
                    "🔹 2- Mostrar por pantalla el resultado\n" +
                    "🔹 3- Calcular la suma de todos los números\n" +
                    "🔹 4- Calcular la multiplicación de todos los números\n" +
                    "🔹 5- Salir del programa");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Por favor, introduce el nombre del archivo");
                    nombreArchivo = scanner.nextLine();

                    if (!nombreArchivo.endsWith(".txt")){
                        nombreArchivo += ".txt";
                    }

                    File miArchivo = new File(nombreArchivo);
                    String numerosPares = "";

                    for (int i = 2; i <= 100; i += 2) {
                        numerosPares += i + "\n";
                    }

                    FileWriter fw = null;
                    try {
                        fw = new FileWriter(miArchivo);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    try {
                        fw.write(numerosPares);
                        fw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 2:
                    if (nombreArchivo != null) {
                        try {
                            FileReader fr = new FileReader(nombreArchivo);
                            BufferedReader br = new BufferedReader(fr);
                            String linea = "";

                            while ((linea = br.readLine()) != null) {
                                System.out.println(linea);
                            }
                            fr.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    } else {
                        System.out.println("El archivo no ha sido creado aún, ejecuta la opción 1 primero");
                    }


                    break;

                case 3:
                    if (nombreArchivo != null) {
                        try{
                            FileReader fr = new FileReader(nombreArchivo);
                            BufferedReader br = new BufferedReader(fr);
                            String linea = "";
                            int suma = 0;

                            while ((linea = br.readLine()) != null){
                                suma += Integer.parseInt(linea);
                            }

                            System.out.println("La suma de todos los números es " + suma);
                        } catch(IOException e) {
                            e.printStackTrace();
                        }

                    }
                    break;
                case 4:
                    if (nombreArchivo != null) {
                        try{
                            FileReader fr = new FileReader(nombreArchivo);
                            BufferedReader br = new BufferedReader(fr);
                            String linea = "";
                            double multiplicacion = 1;

                            while ((linea = br.readLine()) != null){
                                multiplicacion *= Integer.parseInt(linea);
                            }

                            System.out.println("La multiplicación de todos los números es " + multiplicacion);
                        } catch(IOException e) {
                            e.printStackTrace();
                            System.out.println("Ha fallado");
                        }

                    }
                    break;
                case 5:
                    condicion = false;
                    System.out.println("Programa terminado");
                    break;

            }

        }
    }
}
