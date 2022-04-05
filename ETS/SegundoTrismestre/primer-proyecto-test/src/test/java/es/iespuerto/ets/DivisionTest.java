package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivisionTest {
    Division division;

    @BeforeEach
    public void BeforeEach(){
        if (division == null){
            division = new Division(1, 2, 0.5, '/');
        }
    }

    @Test
    public void constructoParametrosTest(){
        division = new Division(1, 2, 0, '/');
        assertNotNull(division,"La instancia de la division es nula");
    }

    @Test
    public void divisionTest(){
        try{
            division.dividir();

        }catch(Exception e){
            assertTrue(e.getMessage().contains("por 0"), "No se ha obtenido el mensaje esperado");
        }
    }

    @Test
    public void divisionPorCero() throws Exception{

        division = new Division(1,0,0, '/');
        assertEquals(0.5, division.dividir(), "La operacion no es correcta");
    }
}
