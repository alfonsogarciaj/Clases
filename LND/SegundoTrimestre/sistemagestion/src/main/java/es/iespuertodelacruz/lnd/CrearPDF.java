package es.iespuertodelacruz.lnd;

import java.io.IOException;
import java.util.Scanner;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class CrearPDF {
    // **Menu Usuario*/
    public static void main(String[] args) throws IOException {
        try (PDDocument documento = new PDDocument()) {
            try (Scanner sc = new Scanner(System.in)) {
                int opcion;
                System.out.println("1. Crear documento con titulo e imagen");
                System.out.println("2. Crear documento solo con texto");
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();sc.nextLine();
                switch (opcion) {
                    case 1:
                        PDPage page = CrearPagina();
                        documento.addPage(page);
                        System.out.println("Has seleccionado la opcion 1");
                        System.out.println("Introduce un titulo para el PDF");
                        String titulo = sc.nextLine();
                        PDPageContentStream content = CrearTitulo(documento, page, titulo);
                        System.out.println(
                                "Ahora debe indicar el nombre de la imagen y su formato(Recuerde la imagen debe estar dentro de resources)");
                        String posImagen = sc.nextLine();
                        PDImageXObject ponerImagen = PonerImagen(documento, posImagen);
                        content.drawImage(ponerImagen, 80, 120, ponerImagen.getWidth() / 3,
                                ponerImagen.getHeight() / 3);
                        content.close();
                        System.out.println("Ponga un nombre al documento");
                        String nombrePDF = sc.nextLine();
                        documento.save(nombrePDF + ".pdf");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        PDPage page2 = CrearPagina();
                        documento.addPage(page2);
                        System.out.println("Introduce un texto para el PDF");
                        String titulo2 = sc.nextLine();
                        PDPageContentStream content2 = CrearTexto(documento, page2, titulo2);
                        content2.close();
                        System.out.println("Ponga un nombre al documento");
                        String nombrePDF2 = sc.nextLine();
                        documento.save(nombrePDF2 + ".pdf");
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            }
        }
    }

    /**
     * Metodo donde se crea la pagina del documento
     * 
     * @return la pagina creada
     */
    public static PDPage CrearPagina() {
        PDPage page = new PDPage(PDRectangle.A6);
        return page;
    }

    /**
     * Metodo para crear el texto que desea introducir el usuario
     * 
     * @param documento que se le envia al creador de texto
     * @param page      pagina del documento
     * @param titulo    que le envia el usuario para el documento
     * @return devuelve el documento creado con el texto del usuario
     * @throws IOException
     */
    public static PDPageContentStream CrearTitulo(PDDocument documento, PDPage page, String titulo) throws IOException {
        PDPageContentStream content = new PDPageContentStream(documento, page);
        content.beginText();
        content.setFont(PDType1Font.HELVETICA, 32);
        content.newLineAtOffset(75, page.getMediaBox().getHeight() - 52);
        content.showText(titulo);
        content.endText();
        return content;
    }

    /**
     * Metodo para incorporar una imagen que desea el usuario
     * 
     * @param documento      documento con el texto creado para introducir la imagen
     * @param nombreDeImagen de la imagen que desee el usuario
     * @return documento con la imagen
     * @throws IOException
     */
    public static PDImageXObject PonerImagen(PDDocument documento, String posImagen) throws IOException {
        PDImageXObject imagen = PDImageXObject.createFromByteArray(documento,
                CrearPDF.class.getResourceAsStream("/" + posImagen).readAllBytes(), posImagen);
        return imagen;
    }

        /**
     * Metodo para crear el texto que desea introducir el usuario
     * 
     * @param documento que se le envia al creador de texto
     * @param page      pagina del documento
     * @param titulo    que le envia el usuario para el documento
     * @return devuelve el documento creado con el texto del usuario
     * @throws IOException
     */
    public static PDPageContentStream CrearTexto(PDDocument documento, PDPage page, String titulo) throws IOException {
        PDPageContentStream content = new PDPageContentStream(documento, page);
        content.beginText();
        content.setFont(PDType1Font.TIMES_BOLD, 7);
        content.newLineAtOffset(15, page.getMediaBox().getHeight() - 32);
        content.showText(titulo);
        content.endText();
        return content;
    }
}
