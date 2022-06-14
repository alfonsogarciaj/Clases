package es.iespuerto.refactorizacion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

public class NotaTest {

    Nota nota;

    /**
     * BeforEach para que nota no sea Null
     */
    @BeforeEach
    public void before() {
        if (nota == null) {
            nota = new Nota();
        }
    }

    /**
     * Comprobar insuficiente no sea null
     */
    @Test
    public void insuficienteTest() {
        Assertions.assertNotNull(nota.insuficiente(8), "La nota es null");
    }

    /**
     * Comprobar suficiente no sea null
     */
    @Test
    public void suficienteTest() {
        Assertions.assertNotNull(nota.suficiente(8), "La nota es null");
    }

    /**
     * Comprobar bien no sea null
     */
    @Test
    public void bienTest() {
        Assertions.assertNotNull(nota.bien(8), "La nota es null");
    }

    /**
     * Comprobar notable no sea null
     */
    @Test
    public void notableTest() {
        Assertions.assertNotNull(nota.notable(8), "La nota es null");
    }

    /**
     * Comprobar sobresaliente no sea null
     */
    @Test
    public void sobresalienteTest() {
        Assertions.assertNotNull(nota.sobresaliente(8), "La nota es null");
    }
}
