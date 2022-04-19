package es.iespuerto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.print.DocFlavor.STRING;

public class Fichero {

    String nombre;
    File file;

    /**
     * 
     * @param nombre
     */
    public Fichero(String nombre) throws Exception {
        this.nombre = nombre;
        file = new File(nombre);
        existe();
    }

    public void crear(String cadenaTexto) throws Exception {
        FileWriter fichero = null;
        try {
            fichero = new FileWriter(nombre);
            fichero.write(cadenaTexto + "\n");
        } catch (Exception ex) {
            throw new Exception("Se ha producido un error en la escritura del fichero", ex);
        } finally {
            if (fichero != null) {
                try {
                    fichero.close();
                } catch (IOException e) {
                    throw new Exception("No ha sido podible cerrar el fichero", e);
                }
            }
        }
    }

    public void modificar() {
    }

    /**
     * Funcion que evalua si existe el fichero
     * 
     * @return su existencia
     */
    public boolean existe() throws Exception {
        if (!file.exists()) {
            throw new Exception("No ha sido posible la creacion del fichero");

        }
        return true;
    }

    public void mostrar() {
    }

    public void eliminar() {
    }

    public void guardar() {
    }

}
