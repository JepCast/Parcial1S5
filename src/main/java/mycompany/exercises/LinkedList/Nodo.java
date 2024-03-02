package mycompany.exercises.LinkedList;

// Clase para representar un nodo en una lista enlazada
public class Nodo {
    int valor; // Valor almacenado en el nodo
    Nodo siguiente; // Referencia al siguiente nodo en la lista

    // Constructor para crear un nuevo nodo con un valor dado
    public Nodo(int valor) {
        this.valor = valor; // Asignamos el valor proporcionado al nodo
        this.siguiente = null; // Inicializamos la referencia al siguiente nodo como nula
    }
}

