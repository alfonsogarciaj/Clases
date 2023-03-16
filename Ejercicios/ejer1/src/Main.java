import java.io.*;
import java.util.Scanner;

public class Main {
    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int opcionUsuario;
        do {

            System.out.println("1-.Crear Fichero");
            System.out.println("2-.Mostrar Fichero");
            System.out.println("3-.Salir");

            opcionUsuario = teclado.nextInt();
            switch (opcionUsuario) {
                case 1: {
                    crearTxt();
                    break;
                }
                case 2: {
                    mostrarTxt();
                    break;
                }
                case 3: {
                    System.out.println("Gracias por usar el programa");
                }
                default: {
                    System.out.println("Opcion incorrecta");
                }

            }
        } while (opcionUsuario != 3);
    }

    public static void crearTxt() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("archivo.txt");
            PrintWriter pw = new PrintWriter(fw);
            escribirFichero(pw);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void escribirFichero(PrintWriter pw) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String opcion;
        System.out.println("Introduce tu nombre");
        opcion = teclado.nextLine();
        pw.println(opcion);
        System.out.println("Introduce tus apellidos");
        opcion = teclado.nextLine();
        pw.println(opcion);
        System.out.println("Introduce tu lugar de nacimiento");
        opcion = teclado.nextLine();
        pw.println(opcion);
    }
    public static void leerFichero(BufferedReader br) throws Exception {
        String linea;
        linea = br.readLine();
        while (linea != null) {

            System.out.println(linea);
            linea = br.readLine();

        }
    }

    public static void mostrarTxt() {
        FileReader fr = null;
        try {
            File fichero = new File("archivo.txt");
            fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            leerFichero(br);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void main(String[] args) {
        menu();
    }


}