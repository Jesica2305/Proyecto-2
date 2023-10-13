public class Disparos {
    private Tablero tablero;

    /**
      * Constructor de la clase Disparos el cual recibe un objeto Tablero y se asigna con la variable tablero para que Disparos interactue con ese tablero.
      * Complejidad Temporal: O(1) Tiempo constante
      */
    public Disparos(Tablero tablero) {
        this.tablero = tablero;
    }

    /**
      * Método para verificar el disparo del usuario en el tablero
      * Complejidad Temporal: O(1) Tiempo constante
      */
    public boolean verificarCoordenada(int filaUsuario, int columnaUsuario) {
        if (filaUsuario >= 0 && filaUsuario < tablero.getTAMANO() && columnaUsuario >= 0 && columnaUsuario < tablero.getTAMANO()) {
            char objeto = tablero.getMatriz()[filaUsuario][columnaUsuario];
            if (objeto == '/') {
                System.out.println("Usted ya disparo aqui!");
                return false;
            }
            if (objeto == '.') {
                System.out.println("Usted ya disparo aqui!");
                return false;//Devuelve false si dispara en una coordenada que ya disparo
            }
            if (objeto != '*') {
                    System.out.println("¡Hay un barco en esa coordenada! (" + objeto + ")");
                    tablero.getMatriz()[filaUsuario][columnaUsuario] = '/';

                    return true; // Devuelve true si se acertó un barco
            }
             else {
                System.out.println("No hay un barco en esa coordenada.");
                tablero.getMatriz()[filaUsuario][columnaUsuario] = '.';
             }
        } else {
            System.out.println("Coordenada fuera de rango.");
        }
        return false; // Devuelve false si no se acertó un barco o la coordenada estaba fuera de rango
    }
}

