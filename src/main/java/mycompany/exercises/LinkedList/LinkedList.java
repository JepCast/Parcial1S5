package mycompany.exercises.LinkedList;

// Clase para representar una lista enlazada
public class LinkedList {
    // Nodo que representa la cabeza de la lista enlazada
    Nodo head;

    // Constructor de la lista enlazada
    public LinkedList() {
        this.head = null;
    }

    // Método para agregar un nodo al final de la lista enlazada
    public void agregarNodo(int valor) {
        Nodo nuevoNodo = new Nodo(valor); // Creamos un nuevo nodo con el valor proporcionado
        if (head == null) { // Si la lista está vacía, el nuevo nodo se convierte en la cabeza
            head = nuevoNodo;
        } else {
            Nodo temp = head;
            // Avanzamos al final de la lista para agregar el nuevo nodo
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            // El nuevo nodo se agrega al final de la lista
            temp.siguiente = nuevoNodo;
        }
    }

    // Método para imprimir la lista enlazada como una cadena de valores separados por espacios
    void imprimirLista() {
        Nodo temp = head;
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }

}
