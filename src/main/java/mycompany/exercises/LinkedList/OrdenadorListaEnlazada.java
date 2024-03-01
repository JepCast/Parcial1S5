package mycompany.exercises.LinkedList;

public class OrdenadorListaEnlazada {
    public static void ordenarLista(LinkedList lista) {
        Nodo actual = lista.head;
        while (actual != null) {
            Nodo minimo = actual;
            Nodo temp = actual.siguiente;
            while (temp != null) {
                if (temp.valor < minimo.valor)
                    minimo = temp;
                temp = temp.siguiente;
            }
            // Intercambiar los valores de los nodos
            int tempValor = actual.valor;
            actual.valor = minimo.valor;
            minimo.valor = tempValor;
            actual = actual.siguiente;
        }
    }
}
