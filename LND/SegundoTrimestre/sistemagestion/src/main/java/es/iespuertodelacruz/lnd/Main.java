package es.iespuertodelacruz.lnd;
/*
import java.io.PrintStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        while (salir = false) {
            System.out.println("--------------MENU-----------");
            System.out.println("1.- Crear PDF");
            System.out.println("2.- Crear PDF con Imagen");
            System.out.println("3.- Crear PDF con Imagen y Texto");
            System.out.println("4.- Salir");
            System.out.println("Elige una opcion");

            String v = entrada.nextLine();
            switch (v) {
                case "1":
                    // metodo solo crear pdf
                    break;
                case "2":
                    // metodo crear pdf con imagen
                case "3":
                    // metodo crear pdf con imagen y texto
                    break;
                case "4":
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion Incorrecta, eliga una de las opciones dadas");
                    break;

            }
        }

    }
/*
    public static void creaPDF() throws Exception {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage(PDRectangle.A6);
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);
        }
    }

    public static void añadirText() {

        contentStream.beginText();
        contentStream.setFont(PDType1Font.TIMES_BOLD, 32);
        contentStream.newLineAtOffset(20, page.getMediaBox().getHeight() - 52);
        contentStream.showText("Hello World!");
        contentStream.endText();
    }

    public static void añadirImg() {
        PDImageXObject image = PDImageXObject.createFromByteArray(document,
                Main.class.getResourceAsStream("/java.png").readAllBytes(), "Java Logo");
        contentStream.drawImage(image, 20, 20, image.getWidth() / 3, image.getHeight() / 3);

        contentStream.close();

        document.save("document.pdf");
    }
    */
}
