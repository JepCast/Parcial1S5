package mycompany.exercises.LinkedList;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TestListaEnlazada {
    @Test
    public void testAgregarNodo() {
        LinkedList lista = new LinkedList();
        lista.agregarNodo(1);
        lista.agregarNodo(2);
        lista.agregarNodo(3);
        assertEquals(1, lista.head.valor);
        assertEquals(2, lista.head.siguiente.valor);
        assertEquals(3, lista.head.siguiente.siguiente.valor);
    }

    @Test
    public void testImprimirLista() {
        LinkedList lista = new LinkedList();
        lista.agregarNodo(1);
        lista.agregarNodo(2);
        lista.agregarNodo(3);
        assertEquals("1 2 3", lista.imprimirLista());
    }
}