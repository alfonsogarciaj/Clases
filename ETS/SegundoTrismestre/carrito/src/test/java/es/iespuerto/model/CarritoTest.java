package es.iespuerto.controlador;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CarritoTest {
    
    Carrito carrito = null;
    Producto producto = null;

    @BeforeEach
    public void before() {
        if (carrito == null) {
            productosComprados = new TreeMap<>();
        }
    }

    @Test
    public void constructorTest() {
       Assertions.assertNotNull(carrito, "El objeto producto no puede ser NULO");
    }

    




}
