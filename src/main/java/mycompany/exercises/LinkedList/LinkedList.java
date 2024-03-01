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
    public void imprimirLista() {
        Nodo temp = head;
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }
}
