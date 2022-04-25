package es.iespuertodelacruz.lnd;

public class Rss {

    public static String etiquetaXML() {

        return "<?xml version=\"1.0\"?>\n";

    }

    public static String etiquetaRSS(boolean cerrar) {

        if (cerrar) {
            return "</rss>";
        } else {
            return "<rss version=\"2.0\">\n";
        }
    }

    public static String addEtiqueta(String nombre, boolean cerrar) {

        if (cerrar) {
            return "</" + nombre + ">\n";
        } else {
            return "<" + nombre + ">";
        }

    }

    public static String etiquetaPadre(String nombre, boolean cerrar) {

        if (cerrar) {
            return "</" + nombre + ">\n";
        } else {
            return "<" + nombre + ">\n";
        }

    }

    public static String crearRss(String... etiquetaTexto) {

        String respuesta = "";

        respuesta += etiquetaXML() +
                etiquetaRSS(false) +
                "\t" +
                etiquetaPadre(etiquetaTexto[0], false);

        for (int i = 1; i < etiquetaTexto.length; i += 2) {
            respuesta += "\t\t" + addEtiqueta(etiquetaTexto[i], false) + etiquetaTexto[i + 1]
                    + addEtiqueta(etiquetaTexto[1], true);

        }
        ;
        respuesta += "\t" +
                etiquetaPadre(etiquetaTexto[0], true) +
                etiquetaRSS(true);

        return respuesta;

    }

    public static void main(String[] args) {

        System.out.println(
                crearRss(
                        "channel",
                        "tittle", "Prueba",
                        "link", "https://github.com/Yared70",
                        "description", "Prueba de descripcion"));

    }

}

/*
 * <?xml version="1.0"?>
 * <rss version="2.0">
 * <channel>
 * <title>Prueba</title>
 * <link>https://github.com/usuario</link>
 * <description>Prueba de descripcion</description>
 * </channel>
 * </rss>
 */
