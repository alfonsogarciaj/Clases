package es.iespuerto.refactorizacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    public static final int CANTIDAD = 30;
    public static final String EUR = "EUR";
    Money money;

    @BeforeEach
    public void before(){
        if (money == null){
            money = new Money(CANTIDAD,EUR);
        }
    }

    @Test
    public void monedaNotNullTest(){
        Assertions.assertNotNull(money, "El objeto de moneda no es nulo");
    }
}
