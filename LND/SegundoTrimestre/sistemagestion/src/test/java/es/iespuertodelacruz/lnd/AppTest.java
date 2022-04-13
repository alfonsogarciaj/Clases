package es.iespuertodelacruz.lnd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    public void CrearPagina(){
        assertNotNull(crearPDF, "La instancia de crear Page es nula");    
    }

    @Test
    public void CrearTitulo(){
        assertNotNull(crearPDF, "La instancia de crear titulo es nula");
    }

    @Test
    public void PonerImagen(){
        assertNotNull(crearPDF,"La instancia de poner imagen es nula");
    }
}
