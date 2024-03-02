package mycompany.exercises.Matriz;
import java.util.ArrayList;
import java.util.List;

// Clase para representar una matriz y encontrar posiciones adyacentes
public class Matriz {
    private int[][] matriz; // Matriz de enteros

    // Constructor que recibe la matriz como parámetro
    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    // Método para obtener las posiciones adyacentes a una posición dada
    public List<Posicion> obtenerPosicionesAdyacentes(Posicion posicion) {
        List<Posicion> adyacentes = new ArrayList<>(); // Lista para almacenar las posiciones adyacentes

        // Verificar arriba
        if (posicion.fila > 0) {
            adyacentes.add(new Posicion(posicion.fila - 1, posicion.columna)); // Agregar la posición de arriba
        }
        // Verificar abajo
        if (posicion.fila < matriz.length - 1) {
            adyacentes.add(new Posicion(posicion.fila + 1, posicion.columna)); // Agregar la posición de abajo
        }
        // Verificar izquierda
        if (posicion.columna > 0) {
            adyacentes.add(new Posicion(posicion.fila, posicion.columna - 1)); // Agregar la posición de la izquierda
        }
        // Verificar derecha
        if (posicion.columna < matriz[0].length - 1) {
            adyacentes.add(new Posicion(posicion.fila, posicion.columna + 1)); // Agregar la posición de la derecha
        }

        return adyacentes; // Devolver la lista de posiciones adyacentes
    }
}
