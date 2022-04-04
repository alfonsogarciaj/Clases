package es.iespueto.lnd;

public class Utilidades {

    /**
     * Funcion que genera la etiqueta xml
     * @return String con etiqueta xml
     */
    protected static String generarEtiquetaXml() {
        return "<?xml version=\"1.0\"?>\n";
    }

        /**
     * Funcion que genera la etiqueta Rss
     * @return String con etiqueta rss
     */
    protected static String generarEtiquetaRSS() {
        return "<rss version=\"2.0\">\n";
    }

    /**
     * Funcion que genera una etiqueta de apertura o cierre
     * @param nombre Nombre de la etiqueta a generar
     * @param cerrar Boolean que indica si la etiqueta debe ser cerrada
     * @return Etiqueta creada correctamente
     */
    protected static String generarEtiqueta(String nombre, boolean cerrar) {
        String resultado = "<";
        if (cerrar) {
            resultado.concat("/");
        }
        return resultado.concat(">\n");
    }

    /**
     * Funcion que crea una etiqueta con contenido
     * @param etiqueta Nombre de la etiqueta que se desea crear
     * @param contenido Contenido de la etiqueta a crear
     * @return Etiqueta con el contenido creada
     */
    protected static String generarEtiqueta(String etiqueta, String contenido) {
        String resultado = null;
        resultado = generarEtiqueta(etiqueta, false);
        if (contenido != null) {
            resultado.concat(contenido);
        }
        resultado = generarEtiqueta(etiqueta, true);
        return resultado +"\n";
    }

    /**
     * Funcion que crea la estructura basica de una etiqueta compuesta
     * @param titulo de la etiqueta
     * @param enlace enlace dela etiqueta
     * @param descripcion descripcion de la etiqueta
     * @return
     */
    public static String crearEstructuraBasica(String titulo, String enlace, String descripcion) {
        String resultado = "";

        resultado = generarEtiqueta("title", titulo);
        resultado.concat("/n");
        resultado = generarEtiqueta("link", enlace);
        resultado.concat("/n");
        resultado = generarEtiqueta("description", descripcion);
        resultado.concat("/n");
        return resultado;
    }

    /**
     * Funcion encargada de crear la etiqueta item y el contenido de esta
     * @param titulo Titulo de la etiqueta item
     * @param enlace Enlace de la etiqueta item
     * @param descripcion Descripcion de la etiqueta item
     * @return Etiqueta Item construida con su informacion
     */
    public static String crearEtiqueta(String elemento, String titulo, String enlace, String descripcion) {

        String resultado = null;
        String contenido = crearEstructuraBasica(titulo, enlace, descripcion);
        resultado = generarEtiqueta("elemento", contenido);
        return resultado;
    }

}
