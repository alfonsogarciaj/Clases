import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Catalogo miCatalogo = new Catalogo(new Pelicula("Renacido",12.4f,new Persona("Pedro","Pascal"),new Persona("Jhon","Travolta")));
        miCatalogo.agregar(new Libro("Adios",11,new Persona("Aitor","Jhon")));
        miCatalogo.agregar(new Pelicula("ayer",16.4f,new Persona("Molina","Garcia"),new Persona("Mike","Carlos")));
        miCatalogo.agregar(new Libro("Bien me sabe",18,new Persona("Carlota","Dias")));
        miCatalogo.agregar(new Pelicula("Cruzcampo",1,new Persona("Cruz","Campo"),new Persona("Alfonso","Jorge")));
        miCatalogo.mostrar();
        miCatalogo.eliminar();
        System.out.println("Dime un titulo que quieras buscar: ");
        String titulo = sc.nextLine();
        miCatalogo.buscarTitulo(titulo);

    }
}