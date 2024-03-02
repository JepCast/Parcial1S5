package mycompany;
import mycompany.exercises.Matriz.Matriz;
import mycompany.exercises.Matriz.Posicion;
import mycompany.exercises.StairsSnakes.StairsSnakes;
import mycompany.exercises.LinkedList.LinkedList;
import mycompany.exercises.LinkedList.OrdenadorListaEnlazada;
import mycompany.exercises.LinkedList.Nodo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear el juego de escaleras y serpientes
        StairsSnakes juego = new StairsSnakes();
        juego.jugar();

        // Crear la matriz y obtener las posiciones adyacentes
        System.out.println("");
        System.out.println("--------------------");
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matriz miMatriz = new Matriz(matriz);
        Posicion posicion = new Posicion(1, 1);

        List<Posicion> adyacentes = miMatriz.obtenerPosicionesAdyacentes(posicion);

        System.out.println("Posiciones adyacentes a la posición (" + posicion.fila + "," + posicion.columna + "):");
        for (Posicion p : adyacentes) {
            System.out.println("(" + p.fila + "," + p.columna + ")");
        }

        // Crear la lista enlazada de acuerdo con la entrada
        LinkedList lista = new LinkedList();
        System.out.println("");
        System.out.println("--------------------");
        lista.agregarNodo(10);
        lista.agregarNodo(-5);
        lista.agregarNodo(3);
        lista.agregarNodo(1);
        lista.agregarNodo(11);

        // Ordenar la lista enlazada
        OrdenadorListaEnlazada.ordenarLista(lista);

        // Imprimir la lista enlazada ordenada
        System.out.println("Lista enlazada ordenada:");
        lista.imprimirLista();

    }
}