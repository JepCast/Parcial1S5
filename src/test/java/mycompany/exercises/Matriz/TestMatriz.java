package mycompany.exercises.Matriz;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

// Clase de pruebas unitarias para la clase Matriz
class TestMatriz {
    // Método de prueba para verificar el método obtenerPosicionesAdyacentes
    @Test
    public void testObtenerPosicionesAdyacentes() {
        // Definir una matriz de ejemplo
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Crear una instancia de la clase Matriz
        Matriz miMatriz = new Matriz(matriz);

        // Definir una posición de ejemplo
        Posicion posicion = new Posicion(1, 1);

        // Obtener las posiciones adyacentes a la posición dada
        List<Posicion> adyacentes = miMatriz.obtenerPosicionesAdyacentes(posicion);

        // Verificar el número de posiciones adyacentes
        assertEquals(4, adyacentes.size());

        // Verificar las posiciones adyacentes obtenidas
        assertEquals(0, adyacentes.get(0).fila);
        assertEquals(1, adyacentes.get(0).columna);
        assertEquals(2, adyacentes.get(1).fila);
        assertEquals(1, adyacentes.get(1).columna);
        assertEquals(1, adyacentes.get(2).fila);
        assertEquals(0, adyacentes.get(2).columna);
        assertEquals(1, adyacentes.get(3).fila);
        assertEquals(2, adyacentes.get(3).columna);
    }
}

