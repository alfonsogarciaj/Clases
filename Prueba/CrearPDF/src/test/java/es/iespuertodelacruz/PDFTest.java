package es.iespuertodelacruz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PDFTest {

    PDF PDF = new PDF();

    @BeforeEach
    public void BeforeEach(){
        if (PDF == null){
            PDF = new PDF();
        }
    }

    @Test
    public void addPdfTest(){
        PDF = new PDF();
        assertNotNull(PDF,"El PDF es nulo");
    }

}
