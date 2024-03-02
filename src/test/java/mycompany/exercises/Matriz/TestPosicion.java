package mycompany.exercises.Matriz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Clase de pruebas unitarias para la clase Posicion
class TestPosicion {
    // Método de prueba para verificar el constructor de Posicion
    @Test
    public void testConstructor() {
        // Crear una nueva posición con fila 3 y columna 5
        Posicion posicion = new Posicion(3, 5);

        // Verificar si la fila y la columna de la posición se asignaron correctamente
        assertEquals(3, posicion.fila); // Verificar la fila de la posición
        assertEquals(5, posicion.columna); // Verificar la columna de la posición
    }
}
