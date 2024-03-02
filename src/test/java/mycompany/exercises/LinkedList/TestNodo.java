package mycompany.exercises.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Clase de pruebas unitarias para la clase Nodo
class TestNodo {
    // Método de prueba para verificar el constructor de Nodo
    @Test
    public void testConstructor() {
        // Crear un nuevo nodo con valor 5
        Nodo nodo = new Nodo(5);

        // Verificar si el valor del nodo es 5 y si el siguiente nodo es nulo
        assertEquals(5, nodo.valor); // Verificar el valor del nodo
        assertNull(nodo.siguiente); // Verificar si el siguiente nodo es nulo
    }
}
