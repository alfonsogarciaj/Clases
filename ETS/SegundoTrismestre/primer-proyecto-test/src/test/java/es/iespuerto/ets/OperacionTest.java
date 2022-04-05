package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OperacionTest {
    
    Operacion operacion = null;

    @Test
    public void ConstructorDefectoTest(){
        operacion = new Operacion();
        assertNotNull(operacion, "la variable es nula");
    }

    @Test
    public void toStringTest() {
        operacion = new Operacion(1,2,3,'+');
        assertNotNull(operacion, "la variable es nula");
        String cadena = operacion.toString();
        assertTrue(cadena.contains("3"), "La cadena no contiene el valor esperado");
    }
}
