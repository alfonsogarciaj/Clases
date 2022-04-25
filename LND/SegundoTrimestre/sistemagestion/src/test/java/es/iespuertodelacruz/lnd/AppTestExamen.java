package es.iespuertodelacruz.lnd;

import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;

/**
 * Unit test for simple APP
 */
public class AppTestExamen {
    
    CrearPDFExamen crearPDFExamen;
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    public void crearPDFExamen(){
        crearPDFExamen = new CrearPDFExamen();
        assertNotNull(crearPDFExamen, "La instancia de PDF es nulo");
    }

    @BeforeEach
    public void PDPageContentStream(){
        assertNotNull(crearPDFExamen, "Se crea contenido");
    }

}
