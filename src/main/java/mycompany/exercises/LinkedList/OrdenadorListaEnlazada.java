package mycompany.exercises.LinkedList;

// Clase para ordenar una lista enlazada
public class OrdenadorListaEnlazada {

    // Método estático para ordenar una lista enlazada dado su cabeza
    public static void ordenarLista(LinkedList lista) {
        Nodo actual = lista.head; // Comenzamos desde la cabeza de la lista
        while (actual != null) {
            Nodo minimo = actual; // Suponemos que el nodo actual contiene el valor mínimo
            Nodo temp = actual.siguiente; // Comenzamos la comparación desde el nodo siguiente
            while (temp != null) {
                // Si encontramos un nodo con un valor menor, actualizamos el nodo mínimo
                if (temp.valor < minimo.valor)
                    minimo = temp;
                temp = temp.siguiente; // Pasamos al siguiente nodo
            }
            // Intercambiar los valores de los nodos actual y mínimo
            int tempValor = actual.valor;
            actual.valor = minimo.valor;
            minimo.valor = tempValor;
            actual = actual.siguiente; // Pasamos al siguiente nodo para continuar con la ordenación
        }
    }
}

