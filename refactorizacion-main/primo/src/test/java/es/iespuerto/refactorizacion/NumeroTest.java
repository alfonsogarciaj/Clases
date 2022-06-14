package es.iespuerto.refactorizacion;

import org.junit.jupiter.api.*;

public class NumeroTest {
    int[] arrayNumero;
    Numero numero = new Numero();


    @Test
    public void arrayNuloTest() {
        arrayNumero = numero.primos(0);
        Assertions.assertTrue(arrayNumero.length == 0);
    }

    @Test
    public void array2Test() {
        arrayNumero = numero.primos(2);
        Assertions.assertEquals(arrayNumero.length, 1);
        Assertions.assertEquals(arrayNumero[0], 2);
    }

    @Test
    public void array3Test() {
        arrayNumero = numero.primos(3);
        Assertions.assertEquals(arrayNumero[0], 2);
        Assertions.assertEquals(arrayNumero[1], 3);

    }

    @Test
    public void array100Test() {
        arrayNumero = numero.primos(100);
        Assertions.assertEquals(arrayNumero[24], 97);

    }
}
