package mycompany.exercises.StairsSnakes;

// Clase para representar el juego de Escaleras y Serpientes
public class StairsSnakes {
    // Constantes para el tamaño del tablero y el número máximo de caras de un dado
    private static final int TAMAÑO_TABLERO = 64;
    private static final int MAX_CARAS_DADO = 6;
    // Constante para representar una casilla bloqueada
    private static final int BLOQUEADO = 1;
    // Arreglos para las casillas especiales y el tablero
    private final int[] casillasEspecialesOrigen;
    private final int[] casillasEspecialesDestino;
    private final int[] tablero;
    // Variables para la posición actual del jugador y el número de tiros consecutivos de seis
    private int posicionActualJugador;
    private int numeroTirosConsecutivosSeis;

    // Constructor de la clase StairsSnakes
    public StairsSnakes() {
        // Inicialización de los arreglos y variables
        this.casillasEspecialesOrigen = new int[]{7, 11, 31, 30, 40, 43, 50, 59};
        this.casillasEspecialesDestino = new int[]{38, 37, 46, 2, 21, 60, 5, 42};
        this.tablero = new int[TAMAÑO_TABLERO];
        this.posicionActualJugador = 1;
        this.numeroTirosConsecutivosSeis = 0;
    }

    // Método para simular un turno de juego
    public void jugar() {
        while (!haGanado()) {
            int tiradaDado = tirarDado();
            if (numeroTirosConsecutivosSeis < 3) {
                moverJugador(tiradaDado);
            } else {
                reiniciarPosicionJugador();
            }
            if (tiradaDado == MAX_CARAS_DADO) {
                numeroTirosConsecutivosSeis++;
            } else {
                numeroTirosConsecutivosSeis = 0;
            }
            System.out.println("El jugador ha sacado un " + tiradaDado + " y se encuentra en la casilla " + posicionActualJugador);
        }
        System.out.println("Felicidades, has ganado el juego!"); // Mensaje de victoria
    }

    // Método para mover al jugador en el tablero
    private void moverJugador(int numeroCasillas) {
        posicionActualJugador += numeroCasillas;
        if (posicionActualJugador > TAMAÑO_TABLERO) {
            int exceso = posicionActualJugador - TAMAÑO_TABLERO;
            posicionActualJugador = TAMAÑO_TABLERO - exceso;
        }
        int posicionDestinoEspecial = obtenerPosicionDestinoEspecial(posicionActualJugador);
        if (posicionDestinoEspecial != -1) {
            posicionActualJugador = posicionDestinoEspecial;
        }
    }

    // Método para obtener la posición de destino especial si la casilla es una escalera o serpiente
    private int obtenerPosicionDestinoEspecial(int posicionActual) {
        for (int i = 0; i < casillasEspecialesOrigen.length; i++) {
            if (casillasEspecialesOrigen[i] == posicionActual) {
                return casillasEspecialesDestino[i];
            }
        }
        return -1;
    }

    // Método para reiniciar la posición del jugador si saca tres veces seis consecutivos
    private void reiniciarPosicionJugador() {
        posicionActualJugador = BLOQUEADO;
        numeroTirosConsecutivosSeis = 0;
    }

    // Método para verificar si el jugador ha ganado el juego
    private boolean haGanado() {
        return posicionActualJugador >= TAMAÑO_TABLERO;
    }

    // Método para simular el lanzamiento de un dado
    private int tirarDado() {
        return (int) (Math.random() * MAX_CARAS_DADO) + 1;
    }
}



