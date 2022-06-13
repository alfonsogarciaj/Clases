package es.iespuertodelacruz;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PDFTest {

    PDF PDF = new PDF();
    PDPage page;
    PDDocument document;
    PDPageContentStream contentStream;
    PDImageXObject image;

    @BeforeEach
    public void BeforeEach(){
        if (PDF == null){
            PDF = new PDF();
        }
    }

    @Test
    public void addPdfTest(){
        document = new PDDocument();
        assertNotNull(document,"El documento es nulo");

    }

    @Test
    public void addPageTest(){
        page = new PDPage();
        assertNotNull(page,"La pagina es nula");
    }





}
