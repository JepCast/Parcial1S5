package mycompany.exercises.Matriz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestPosicion {
    @Test
    public void testConstructor() {
        Posicion posicion = new Posicion(3, 5);
        assertEquals(3, posicion.fila);
        assertEquals(5, posicion.columna);
    }

}