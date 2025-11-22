package cl.examen.auto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void sumar_deberiaRetornarLaSumaCorrecta() {
        Calculator calculator = new Calculator();
        int resultado = calculator.sumar(2, 3);
        assertEquals(5, resultado, "2 + 3 debe ser 5");
    }

    @Test
    void multiplicar_deberiaRetornarElProductoCorrecto() {
        Calculator calculator = new Calculator();
        int resultado = calculator.multiplicar(4, 5);
        assertEquals(20, resultado, "4 * 5 debe ser 20");
    }
}