import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {
    Scanner sc = new Scanner(System.in);

    private ArrayList<Producto> productos;
    public Catalogo(Producto producto){
        productos = new ArrayList<>();
        productos.add(producto);
    }
    public ArrayList<Producto> getProductos(){
        return  productos;
    }
    public void agregar(Producto producto){
        productos.add(producto);
    }

    public void mostrar(){
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }
    }

    public void eliminar(){
        System.out.println("Que Id quiere eliminar?");
        int opcion = sc.nextInt();sc.nextLine();
        productos.removeIf(producto -> producto.getId() == opcion);
        mostrar();
    }

    public void buscarTitulo(String titulo){
        for (Producto producto : getProductos()) {
            if(producto instanceof Libro){
                Libro libro = (Libro) producto;
                if (libro.getTitulo().equals(titulo)){
                    System.out.println("Titulo: " + libro.getTitulo() + ", autor: " + libro.getAutor() + ", ID: " + libro.getId());
                }
            }else{
                Pelicula pelicula = (Pelicula) producto;
                if (pelicula.getTitulo().equals(titulo)){
                    System.out.println("Titulo: " + pelicula.getTitulo() + ", protagonista: " + pelicula.getProtagonista() + ", ID: " + pelicula.getId());
                }
            }
        }
    }
}
