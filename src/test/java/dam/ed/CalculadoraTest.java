package dam.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    // Definimos el objeto para usarlo en todos los tests
    static Calculadora miCalculadora;

    @BeforeAll
    public static void setUpClass(){
        miCalculadora = new Calculadora();
    }

    @Test
    @DisplayName("Divisiones enteras y reales")
    void testDivisionesEnterasYReales() throws Exception {
        assertEquals(2, miCalculadora.divide(4,2));
        assertEquals(2.5, miCalculadora.divide(10,4));
        assertEquals(4, miCalculadora.divide(10,2.5));
        assertEquals(3.2, miCalculadora.divide(8,2.5));
        assertEquals(0.5, miCalculadora.divide(2,4));
    }

    @Test
    @DisplayName("Divisiones positivos y negativos")
    void testDivisionesPositivosYNegativos() throws Exception {
        assertTrue(miCalculadora.divide(4,2) > 0);
        assertTrue(miCalculadora.divide(4,-2)< 0);
        assertTrue(miCalculadora.divide(-4,2) < 0);
        assertTrue(miCalculadora.divide(-4,-2) > 0);
    }

    @Test
    @DisplayName("División por cero causa excepción")
    void testDivisionPorCero() {
        Exception thrown = assertThrows(Exception.class, () -> {
            miCalculadora.divide(5,0);
        });

        assertEquals("El divisor es 0", thrown.getMessage());
    }

    @Test
    @DisplayName("Hacer factorial")
    void testFactorial() throws Exception {
        assertEquals(720, miCalculadora.factorial(6));
        assertEquals(1, miCalculadora.factorial(1));
        Exception thrown = assertThrows(Exception.class, ()-> miCalculadora.factorial(-4));
        assertEquals("No se puede hacer el factorial de un número negativo o cero", thrown.getMessage());

        assertThrows(Exception.class, ()-> miCalculadora.factorial(0));
        assertEquals("No se puede hacer el factorial de un número negativo o cero", thrown.getMessage());
    }

    @Test
    @DisplayName("Suma positivos y negativos")
    void testSumaPositivosYNegativos(){
        assertEquals(5.5, miCalculadora.suma(2, 3.5));
        assertEquals(1, miCalculadora.suma(4, -3));
        assertEquals(-9, miCalculadora.suma(-4, -5));
        assertEquals(2, miCalculadora.suma(4, -2));
    }

    @Test
    @DisplayName("Resta positivos y negativos")
    void testRestaPositivosYNegativos(){
        assertEquals(9, miCalculadora.resta(4, -5));
        assertEquals(8, miCalculadora.resta(4, -4));
        assertEquals(6.2, miCalculadora.resta(4, -2.2));
        assertEquals(-0.8, miCalculadora.resta(-4, -3.2), 0.00000001);
    }

    @Test
    @DisplayName("Comprobación números primos y no primos")
    void testEsPrimo() throws Exception{
        Exception thrown = assertThrows(Exception.class, ()-> assertFalse(miCalculadora.esPrimo(-4)));
        assertEquals("Un número negativo no puede ser primo", thrown.getMessage());
        assertTrue(miCalculadora.esPrimo(1));
        assertFalse(miCalculadora.esPrimo(8));
        assertTrue(miCalculadora.esPrimo(7));
    }

    @Test
    @DisplayName("Multiplicaciones enteras y reales")
    void testMultiplicacionesEnterasYReales() throws Exception {
        assertEquals(30, miCalculadora.multiplica(5, 6));
        assertEquals(-8, miCalculadora.multiplica(2, -4));
        assertEquals(-12, miCalculadora.multiplica(-3, 4));
        assertEquals(4, miCalculadora.multiplica(-2, -2));
        assertEquals(0, miCalculadora.multiplica(9, 0));
    }

    @Test
    @DisplayName("Multiplicaciones positivos y negativos")
    void testMultiplicaPositivosYNegativos() throws Exception {
        assertTrue(miCalculadora.multiplica(4,2) > 0);
        assertTrue(miCalculadora.multiplica(4,-2)< 0);
        assertTrue(miCalculadora.multiplica(-4,2) < 0);
        assertTrue(miCalculadora.multiplica(-4,-2) > 0);
    }

    @Test
    @DisplayName("Pruebas Raíz cuadrada positivos y negativos.")
    void testRaizCuadrada() throws Exception{
        assertEquals(1, miCalculadora.raizCuadrada(1));
        assertEquals(0, miCalculadora.raizCuadrada(0));
        assertEquals(2, miCalculadora.raizCuadrada(4));
        assertEquals(1.4142135623730951, miCalculadora.raizCuadrada(2));
        Exception thrown = assertThrows(Exception.class, ()-> miCalculadora.raizCuadrada(-4));
        assertEquals("El radicando no puede ser negativo.", thrown.getMessage());
    }
}