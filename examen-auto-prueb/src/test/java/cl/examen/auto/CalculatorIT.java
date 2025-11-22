package cl.examen.auto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ejemplo de prueba de integración.
 * En un proyecto real podría combinar varias clases / capas,
 * aquí lo usamos para diferenciar tipo de prueba en el pipeline.
 */
class CalculatorIT {

    @Test
    void sumar_y_multiplicar_deberianFuncionarEnConjunto() {
        Calculator calculator = new Calculator();

        int suma = calculator.sumar(10, 5);        // 15
        int producto = calculator.multiplicar(suma, 2); // 30

        assertEquals(30, producto, "El flujo completo debería dar 30");
    }
}