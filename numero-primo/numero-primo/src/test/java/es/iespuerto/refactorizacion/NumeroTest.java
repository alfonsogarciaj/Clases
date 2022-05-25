package es.iespuerto.refactorizacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeroTest {
    int[] arrayNumero;


    @Test
    public void arrayNuloTest() {
        arrayNumero = Numero.primos(0);
        Assertions.assertTrue(arrayNumero.length == 0);
    }

    @Test
    public void array2Test() {
        arrayNumero = Numero.primos(2);
        Assertions.assertEquals(arrayNumero.length, 1);
        Assertions.assertEquals(arrayNumero[0], 2);
    }

    @Test
    public void array3Test() {
        arrayNumero = Numero.primos(3);
        Assertions.assertEquals(arrayNumero[0], 2);
        Assertions.assertEquals(arrayNumero[1], 3);

    }

    @Test
    public void array100Test() {
        arrayNumero = Numero.primos(100);
        Assertions.assertEquals(arrayNumero[24], 97);

    }
}
