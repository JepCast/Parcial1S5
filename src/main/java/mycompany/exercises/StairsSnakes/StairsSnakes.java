package mycompany.exercises.StairsSnakes;

public class StairsSnakes {
    private static final int TAMAÑO_TABLERO = 64;
    private static final int MAX_CARAS_DADO = 6;
    private static final int BLOQUEADO = 1;
    private final int[] casillasEspecialesOrigen;
    private final int[] casillasEspecialesDestino;
    private final int[] tablero;
    private int posicionActualJugador;
    private int numeroTirosConsecutivosSeis;

    public StairsSnakes() {
        this.casillasEspecialesOrigen = new int[]{7, 11, 31, 30, 40, 43, 50, 59};
        this.casillasEspecialesDestino = new int[]{38, 37, 46, 2, 21, 60, 5, 42};
        this.tablero = new int[TAMAÑO_TABLERO];
        this.posicionActualJugador = 1;
        this.numeroTirosConsecutivosSeis = 0;
    }

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
        System.out.println("Felicidades, has ganado el juego!");
    }

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

    private int obtenerPosicionDestinoEspecial(int posicionActual) {
        for (int i = 0; i < casillasEspecialesOrigen.length; i++) {
            if (casillasEspecialesOrigen[i] == posicionActual) {
                return casillasEspecialesDestino[i];
            }
        }
        return -1;
    }

    private void reiniciarPosicionJugador() {
        posicionActualJugador = BLOQUEADO;
        numeroTirosConsecutivosSeis = 0;
    }

    private boolean haGanado() {
        return posicionActualJugador >= TAMAÑO_TABLERO;
    }

    private int tirarDado() {
        return (int) (Math.random() * MAX_CARAS_DADO) + 1;
    }

}


