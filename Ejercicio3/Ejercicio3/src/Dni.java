import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Dni {

    public static void aniadirDni() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduce el DNI");
        String dni = sc.nextLine();
        if (ComprobarDni(dni)) {
            File miDni = new File("dni.txt");
            if (!miDni.exists()) {
                try {
                    FileWriter fw = new FileWriter(miDni);
                    fw.write(dni);
                    fw.close();
                    System.out.println("El archivo dni.txt fue creado");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    File miDni2 = new File("dni.txt");
                    FileReader fr = new FileReader(miDni2);
                    BufferedReader br = new BufferedReader(fr);
                    String texto = "";
                    String linea = null;
                    while ((linea = br.readLine()) != null) {
                        texto += linea + "\n";
                    }

                    texto += dni;
                    FileWriter fw = new FileWriter(miDni);
                    fw.write(texto);
                    fw.close();
                    System.out.println("El archivo dni.txt fue actualizado");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("El DNI introducido no es válido, por lo que no fue añadido al archivo .txt");
        }

    }


    private static boolean ComprobarDni(String dni) {
        int numero = Integer.parseInt(dni.substring(0, 8));
        String letra = dni.substring(8);
        ArrayList<String> miArrayList = new ArrayList<>(Arrays.asList("T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"));

        if (String.valueOf(numero).length() == 8 && miArrayList.get(numero % 23).equals(letra)) {
            return true;
        } else {
            return false;
        }

    }
}
