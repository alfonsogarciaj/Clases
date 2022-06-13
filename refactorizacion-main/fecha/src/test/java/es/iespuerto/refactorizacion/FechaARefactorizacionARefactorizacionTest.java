package es.iespuerto.refactorizacion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import es.iespuerto.refactorizacion.FechaARefactorizacion;

public class FechaARefactorizacionARefactorizacionTest {

    FechaARefactorizacion FechaARefactorizacionCorrecta = new FechaARefactorizacion (20, 6, 2008);
    FechaARefactorizacion mesMal1 = new FechaARefactorizacion (21, 0, 3000);
    FechaARefactorizacion mesMal2 = new FechaARefactorizacion (21, 13, 3000);
    FechaARefactorizacion diaMal1 = new FechaARefactorizacion (0, 11, 2000);
    FechaARefactorizacion diaMal2 = new FechaARefactorizacion (32, 11, 2000);
    FechaARefactorizacion diaMalNoviembre = new FechaARefactorizacion (31, 11, 2000);
    FechaARefactorizacion diaBienDiciembre = new FechaARefactorizacion (31, 12, 2000);
    FechaARefactorizacion diaMalFebrero = new FechaARefactorizacion (30, 2, 2008);
    FechaARefactorizacion diaBienFebreroBisiesto1 = new FechaARefactorizacion (29, 2, 2008);
    FechaARefactorizacion diaBienFebreroBisiesto2 = new FechaARefactorizacion (29, 2, 2000);
    FechaARefactorizacion diaMalFebreroBisiesto1 = new FechaARefactorizacion (29, 2, 2007);
    FechaARefactorizacion diaMalFebreroBisiesto2 = new FechaARefactorizacion (29, 2, 1900);


    @Test
    public void fechaCorrectaTest() {
        assertTrue(FechaARefactorizacionCorrecta.valida(),
                "La fecha debe de ser correcta");
    }
    @Test
    public void mesIncorrectoTest() {
        assertFalse(mesMal1.valida(),
                "La fecha debe de ser invalida");

    }

    @Test
    public void mesIncorrecto2Test() {
        assertFalse(mesMal2.valida(),
                "La fecha debe de ser invalida");
    }
    @Test
    public void diaIncorrectoTest() {
        assertFalse(diaMal1.valida(),
                "La fecha debe de ser invalida");
    }
    @Test
    public void diaIncorrecto2Test() {
        assertFalse(diaMal2.valida(),
                "La fecha debe de ser invalida");
    }
    @Test
    public void noviembreIncorrectoTest() {
        assertFalse(diaMalNoviembre.valida(),
                "La fecha debe de ser invalida");
    }
    @Test
    public void diciembreCorrectoTest() {
        assertTrue(diaBienDiciembre.valida(),
                "La fecha debe de ser valida");
    }
    @Test
    public void febreroIncorrectoTest() {
        assertFalse(diaMalFebrero.valida(),
                "La fecha debe de ser invalida");
    }
    @Test
    public void diaBienFebreroBisiestoTest() {
        assertTrue(diaBienFebreroBisiesto1.valida(),
                "La fecha debe de ser valida");
    }
    @Test
    public void diaBienFebreroBisiesto2Test() {
        assertTrue(diaBienFebreroBisiesto2.valida(),
                "La fecha debe de ser valida");
    }
    @Test
    public void diaMalFebreroBisiesto1Test() {
        assertFalse(diaMalFebreroBisiesto1.valida(),
                "La fecha debe de ser invalida");
    }
    @Test
    public void diaMalFebreroBisiesto2Test() {
        assertFalse(diaMalFebreroBisiesto2.valida(),
                "La fecha debe de ser invalida");
    }
}
