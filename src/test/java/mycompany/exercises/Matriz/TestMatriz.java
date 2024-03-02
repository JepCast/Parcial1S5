package mycompany.exercises.Matriz;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

class TestMatriz {
    @Test
    public void testObtenerPosicionesAdyacentes() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matriz miMatriz = new Matriz(matriz);
        Posicion posicion = new Posicion(1, 1);

        List<Posicion> adyacentes = miMatriz.obtenerPosicionesAdyacentes(posicion);

        assertEquals(4, adyacentes.size());
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
