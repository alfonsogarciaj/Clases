package es.iespueto.lnd;

/**
 * Clase encargada de generar un fichero con String
 * @author jpexposito
 */
public final class GeneracionXml extends Utilidades {
    private GeneracionXml() {
    }

    /**
     * Funcion principal del programa
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Fichero:"+generarRSS());
    }

    /**
     * Funcion encargada de generar el contenido xml
     * @return cadena con el contenido en formato xml
     */
    public static String generarRSS() {
        String cadena = null;

        cadena = "<?xml version=\"1.0\"?>"
        +"<rss version=\"2.0\">"
                +"<channel>"
                        +"<title>Prueba</title>"
                        +"<link>https://github.com/usuario</link>"
                        +"<description>Prueba de descripcion</description>"
                +"</channel>"
        +"</rss>";

        cadena = generarEtiquetaXml();
        cadena += generarEtiquetaRSS();
        cadena += crearEtiqueta("channel", "Prueba", "ttps://github.com/usuario", "Prueba de descripcion");
        cadena += generarEtiqueta("channel", true);
        cadena += generarEtiqueta("rss", true);
        
        return cadena;
    }
}
