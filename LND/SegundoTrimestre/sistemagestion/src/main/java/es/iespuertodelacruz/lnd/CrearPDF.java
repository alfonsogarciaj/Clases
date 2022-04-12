package es.iespuertodelacruz.lnd;

import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class CrearPDF{
    public static void main(String[] args) throws IOException{
            try (PDDocument documento = new PDDocument()) {
                try (Scanner sc = new Scanner(System.in)) {
                    boolean salir = false;
                    int opcion;
                    while (!salir) {
                        System.out.println("1. Crear documento con titulo e imagen");
                        System.out.println("2. Crear documento solo con texto ");
                        System.out.println("3. Salir");
                        System.out.println("Escribe una de las opciones");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                PDPage page = CrearPagina();
                                documento.addPage(page);
                                System.out.println("Has seleccionado la opcion 1");
                                System.out.println("Introduce un titulo para el PDF");
                                String titulo = sc.nextLine();
                                PDPageContentStream content = CrearTitulo(documento, page, titulo);
                                System.out.println(
                                "Ahora debe indicar el nombre de la imagen que quiere poner(Recuerde la imagen debe estar dentro de resources)");
                                String nombreDeImagen = sc.nextLine();
                                PDImageXObject ponerImagen = PonerImagen(documento, nombreDeImagen);
                                content.drawImage(ponerImagen, 20, 20, ponerImagen.getWidth() / 3, ponerImagen.getHeight() / 3);
                                content.close();
                                System.out.println("Ponga un nombre al documento");
                                String nombrePDF = sc.nextLine();
                                documento.save(nombrePDF + ".pdf");
                                break;
                            case 2:
                                System.out.println("Has seleccionado la opcion 2");
                                PDPage page2 = CrearPagina();
                                documento.addPage(page2);
                                System.out.println("Has seleccionado la opcion 1");
                                System.out.println("Introduce un titulo para el PDF");
                                String titulo2 = sc.nextLine();
                                PDPageContentStream content2 = CrearTitulo(documento, page2, titulo2);
                                content2.close();
                                System.out.println("Ponga un nombre al documento");
                                String nombrePDF2 = sc.nextLine();
                                documento.save(nombrePDF2 + ".pdf");
                                break;
                            case 3:
                                salir = true;
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 3");
                        }

                    }
                }
            }
        }

    public static PDPage CrearPagina() {
        PDPage page = new PDPage(PDRectangle.A6);
        return page;
    }

    public static PDPageContentStream CrearTitulo(PDDocument documento, PDPage page, String titulo) throws IOException{
        PDPageContentStream content = new PDPageContentStream(documento, page);
        content.beginText();
        content.setFont(PDType1Font.TIMES_BOLD, 32);
        content.newLineAtOffset(20, page.getMediaBox().getHeight() - 52);
        content.showText(titulo);
        content.endText();
        return content;
    }

    public static PDImageXObject PonerImagen(PDDocument documento, String nombreDeImagen) throws IOException{
        PDImageXObject imagen = PDImageXObject.createFromByteArray(documento,
                CrearPDF.class.getResourceAsStream("/java.png").readAllBytes(), nombreDeImagen);
        return imagen;
    }

}
