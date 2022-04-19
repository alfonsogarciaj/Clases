package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.*;


import es.iespuerto.Fichero;

public class FicheroTest {
    
    Fichero fichero;
    String nombre = "test.txt";

    @BeforeEach
    public void BeforeEach(){
        if (fichero == null){
            try{
                fichero = new Fichero(nombre);
            }catch(Exception e){
                fail("Se ha producido un error en el constructor");
            }
        }
    }

    @Test
    public void constructorTest(){
        assertNotNull(fichero, "El fichero es nulo");
    }
    
}
