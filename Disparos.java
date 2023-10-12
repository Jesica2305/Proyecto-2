public class Disparos {
    private Tablero tablero;

    public Disparos(Tablero tablero) {
        this.tablero = tablero;
    }

    public boolean verificarCoordenada(int filaUsuario, int columnaUsuario) {
        if (filaUsuario >= 0 && filaUsuario < tablero.getTAMANO() && columnaUsuario >= 0 && columnaUsuario < tablero.getTAMANO()) {
            char objeto = tablero.getMatriz()[filaUsuario][columnaUsuario];
            if (objeto == '/') {
                System.out.println("Usted ya disparo aqui!");
                return false;
            }
            if (objeto == '.') {
                System.out.println("Usted ya disparo aqui!");
                return false;
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

