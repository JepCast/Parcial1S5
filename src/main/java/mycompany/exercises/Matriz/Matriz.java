package mycompany.exercises.Matriz;
import java.util.ArrayList;
import java.util.List;


public class Matriz {
    private int[][] matriz;

    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    // Método para obtener las posiciones adyacentes a una posición dada
    public List<Posicion> obtenerPosicionesAdyacentes(Posicion posicion) {
        List<Posicion> adyacentes = new ArrayList<>();

        // Verificar arriba
        if (posicion.fila > 0) {
            adyacentes.add(new Posicion(posicion.fila - 1, posicion.columna));
        }
        // Verificar abajo
        if (posicion.fila < matriz.length - 1) {
            adyacentes.add(new Posicion(posicion.fila + 1, posicion.columna));
        }
        // Verificar izquierda
        if (posicion.columna > 0) {
            adyacentes.add(new Posicion(posicion.fila, posicion.columna - 1));
        }
        // Verificar derecha
        if (posicion.columna < matriz[0].length - 1) {
            adyacentes.add(new Posicion(posicion.fila, posicion.columna + 1));
        }

        return adyacentes;
    }
}
