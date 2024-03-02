package mycompany.exercises.LinkedList;

public class LinkedList {
    Nodo head;

    public LinkedList() {
        this.head = null;
    }

    // Función para agregar un nodo al final de la lista enlazada
    public void agregarNodo(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (head == null) {
            head = nuevoNodo;
        } else {
            Nodo temp = head;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Función para imprimir la lista enlazada
    public String imprimirLista() {
        StringBuilder sb = new StringBuilder();
        Nodo actual = head;
        while (actual != null) {
            sb.append(actual.valor).append(" ");
            actual = actual.siguiente;
        }
        return sb.toString().trim();
    }
}
