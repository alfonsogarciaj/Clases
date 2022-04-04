package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class OperacionTest {
    
    Operacion operacion = null;

    @Test
    public void ConstructorDefectoTest(){
        operacion = new Operacion();
        assertNotNull(operacion, "la variable es nula");
    }
}
