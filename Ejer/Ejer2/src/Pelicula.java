import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula extends Producto{
    Scanner sc = new Scanner(System.in);
    ArrayList<Pelicula> peliculas;

    private Persona protagonista;
    private Persona director;

    public Pelicula(String titulo, float precio, Persona protagonista, Persona director) {
        super(titulo, precio);
        this.protagonista = protagonista;
        this.director = director;
    }

    public Persona getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(Persona protagonista) {
        this.protagonista = protagonista;
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + getTitulo() + '\'' +
                ", protagonista='" + protagonista.toString() + '\'' +
                ", director='" + director.toString() + '\'' +
                ", precio=" + getPrecio() +
                ", id=" + getId() +
                '}';
    }

}
