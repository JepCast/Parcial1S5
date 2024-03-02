package mycompany.exercises.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestNodo {
    @Test
    public void testConstructor() {
        Nodo nodo = new Nodo(5);
        assertEquals(5, nodo.valor);
        assertNull(nodo.siguiente);
    }

}