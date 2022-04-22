package es.iespuertodelacruz.lnd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;


/**
 * Unit test for simple App.
 */
class AppTest {

    CrearPDF crearPDF;
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    public void crearPDF(){
        crearPDF = new CrearPDF();
        assertNotNull(crearPDF, "La instancia de PDF es nulo");
    }

    @Test
    public void fichero(){

        /*
        Object archivo = null;
        archivo = new File("");
        */
        //assertNotNull(archivo, "La instancia de fichero es nula");
    }

}
