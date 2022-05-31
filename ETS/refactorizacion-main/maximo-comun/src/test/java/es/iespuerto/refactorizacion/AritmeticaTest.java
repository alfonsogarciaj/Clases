package es.iespuerto.refactorizacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AritmeticaTest {
    Aritmetica aritmetica;

    @BeforeEach
    public void beforeEach () {
        if (aritmetica == null) {
            aritmetica = new Aritmetica();
        }
    }

    @Test
    public void mcmTest(){
        int correcto = 30;
        Assertions.assertEquals(correcto, aritmetica.mcm(10,15),
        "El mcm obtenido no es el esperado");
    }

    @Test
    public void mcdTest(){
        int correcto = 3;
        Assertions.assertEquals(correcto, aritmetica.mcd(78,105),
                "El mcd obtenido no es el esperado");
    }
}
