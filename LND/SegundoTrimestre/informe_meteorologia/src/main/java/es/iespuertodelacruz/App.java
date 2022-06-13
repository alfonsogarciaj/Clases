package es.iespuertodelacruz;

/**
 * @author alfonsogj
 */
public final class App {
    /**
     * App para generar el PDF
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        GenerarPdf pdf = new GenerarPdf();
        pdf.addPagina();
        pdf.leerTxt("src/main/resources/temperaturas-abril.txt", "/aemet.png",
            "aemet", "/home/alumno/Escritorio/Prueba/prueba.pdf");
    }
}

