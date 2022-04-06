package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplicacionTest {
    
    Multiplicacion multiplicacion;

    @BeforeEach
    public void BeforeEach(){
        if (multiplicacion == null){
            multiplicacion = new Multiplicacion(1, 2, 2, '*');
        }

    }

    @Test
    public void constructoDefectoTest(){
        multiplicacion = new Multiplicacion();
        assertNotNull(multiplicacion, "La instancia de la multiplicaicon es nula");
    }

    @Test
    public void constructoParametrosTest(){
        assertNotNull(multiplicacion, "La instancia de la multiplicaicon es nula");
    }

    @Test
    public void multiplicar(){
        assertEquals(2, multiplicacion.multiplicar(), "No se ha obtenido el resultado esperado");

    }

}
