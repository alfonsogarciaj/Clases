package es.iespuertodelacruz.lnd;

import java.io.PrintStream;

import org.apache.pdfbox.contentstream.operator.text.NextLine;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.util.Scanner;

import javax.swing.text.Document;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (PDDocument documento = new PDDocument()) {
            CrearPagina();
            String titulo = "hola";

            CrearTitulo(documento, page, titulo);

            contentStream.drawImage(imagen, 20, 20, image.getWidth() / 3, image.getHeight() / 3);
            contentStream.close();
            documento.save("document.pdf");
        }

    }



    public static PDPage CrearPagina() {
        PDPage page = new PDPage(PDRectangle.A6);
        return page;
    }

    public static PDPageContentStream CrearTitulo(PDDocument documento, PDPage page, String titulo) {
        PDPageContentStream contentStream = new PDPageContentStream(documento, page);
        contentStream.beginText();
        contentStream.setFont(PDType1Font.TIMES_BOLD, 32);
        contentStream.newLineAtOffset(20, page.getMediaBox().getHeight() - 52);
        contentStream.showText(titulo);
        contentStream.endText();
        return contentStream;
    }

    public static PDImageXObject AñadirImagen(PDDocument coumento, String ruta, String nombre {
        PDImageXObject imagen = PDImageXObject.createFromByteArray(documento, Main.class.getResourceAsStream("/java.png").readAllBytes(), "Java Logo");
        return imagen;
    }

}
