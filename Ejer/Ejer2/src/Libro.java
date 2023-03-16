import java.util.ArrayList;
import java.util.Scanner;

public class Libro extends Producto{
    Scanner sc = new Scanner(System.in);
    ArrayList<Libro> libros;

    private Persona autor;


    public Libro(String titulo, float precio, Persona autor) {
        super(titulo, precio);
        this.autor = autor;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }



    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor.toString() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", precio=" + getPrecio() +
                ", id=" + getId() +
                '}';
    }



}
