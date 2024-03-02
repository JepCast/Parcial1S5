package mycompany;

// Importaciones de las clases y paquetes necesarios
import mycompany.exercises.Matriz.Matriz;
import mycompany.exercises.Matriz.Posicion;
import mycompany.exercises.StairsSnakes.StairsSnakes;
import mycompany.exercises.LinkedList.LinkedList;
import mycompany.exercises.LinkedList.OrdenadorListaEnlazada;

import java.util.List; // Importación para trabajar con listas

// Clase principal del programa
public class Main {
    public static void main(String[] args) {
        // Crear el juego de escaleras y serpientes y ejecutarlo
        StairsSnakes juego = new StairsSnakes();
        juego.jugar();

        // Crear una matriz y obtener las posiciones adyacentes
        System.out.println("");
        System.out.println("--------------------");
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matriz miMatriz = new Matriz(matriz); // Crear un objeto Matriz
        Posicion posicion = new Posicion(1, 1); // Crear una posición en la matriz

        // Obtener las posiciones adyacentes a la posición dada
        List<Posicion> adyacentes = miMatriz.obtenerPosicionesAdyacentes(posicion);

        // Imprimir las posiciones adyacentes
        System.out.println("Posiciones adyacentes a la posición (" + posicion.fila + "," + posicion.columna + "):");
        for (Posicion p : adyacentes) {
            System.out.println("(" + p.fila + "," + p.columna + ")");
        }

        // Crear una lista enlazada y agregar nodos
        LinkedList lista = new LinkedList();
        System.out.println("");
        System.out.println("--------------------");
        lista.agregarNodo(10);
        lista.agregarNodo(5);
        lista.agregarNodo(-3);
        lista.agregarNodo(1);
        lista.agregarNodo(11);

        // Ordenar la lista enlazada
        OrdenadorListaEnlazada.ordenarLista(lista);

        // Imprimir la lista enlazada ordenada
        System.out.println("Lista enlazada ordenada:");
        lista.imprimirLista();
    }
}
