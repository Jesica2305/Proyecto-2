import java.util.Random;

public class Barco {
    private Tablero tablero;

    /**
      * Constructor donde Barco recibe como parametro Tablero y como variable tablero para que la clase Barco acceda al tablero donde se ubicaran los barcos
      * Complejidad Temporal: O(1) Tiempo constante
      */
    public Barco(Tablero tablero) {
        this.tablero = tablero;
    }

    /**
      * Método el cual llama a los cuatro métodos de colocación de barcos
      * Complejidad Temporal: O(1) Tiempo constante
      */
    public void colocarBarcos() {
        colocarBarco1();
        colocarBarco2();
        colocarBarco3();
        colocarBarco4();
    }

    /**
      * Método que ubica de forma aleatoria los barcos 'D' y 'E' donde cada uno ocupa una casilla 
      * Complejidad Temporal: O(1) Tiempo constante
      */
    private void colocarBarco1() {
        Random random = new Random();
        int TAMANO = tablero.getTAMANO();
        for (int i = 0; i < 2; i++) {
            int fila = random.nextInt(TAMANO);
            int columna = random.nextInt(TAMANO);

            while (tablero.getMatriz()[fila][columna] != '*') {
                fila = random.nextInt(TAMANO);
                columna = random.nextInt(TAMANO);
            }

            char barco = (char) ('D' + i); // 'D', 'E'
            tablero.getMatriz()[fila][columna] = barco;
        }
    }

    /**
      * Método el cual ubica aleatoriamente los barcos 'A' y 'B' donde cada uno ocupa dos casillas verticalmente
      * Complejidad Temporal: O(1) Tiempo constante 
      */
    private void colocarBarco2() {
        Random random = new Random();
        int TAMANO = tablero.getTAMANO();
        for (int i = 0; i < 2; i++) {
            int fila = random.nextInt(TAMANO - 1);
            int columna = random.nextInt(TAMANO);

            while (tablero.getMatriz()[fila][columna] != '*' || tablero.getMatriz()[fila + 1][columna] != '*') {
                fila = random.nextInt(TAMANO - 1);
                columna = random.nextInt(TAMANO);
            }

            char barco = (char) ('A' + i); // 'A', 'B'
            tablero.getMatriz()[fila][columna] = barco;
            tablero.getMatriz()[fila + 1][columna] = barco;
        }
    }

    /**
      * Método el cual ubica aleatoriamente el barco 'C' el cual ocupa tres casillas horizontalmente
      * Complejidad Temporal: O(1) Tiempo constante
      */
    private void colocarBarco3() {
        Random random = new Random();
        int TAMANO = tablero.getTAMANO();
        int fila = random.nextInt(TAMANO);
        int columna = random.nextInt(TAMANO - 2);

        while (tablero.getMatriz()[fila][columna] != '*' || tablero.getMatriz()[fila][columna + 1] != '*' || tablero.getMatriz()[fila][columna + 2] != '*') {
            fila = random.nextInt(TAMANO);
            columna = random.nextInt(TAMANO - 2);
        }

        char barco = 'C'; // 'C'
        tablero.getMatriz()[fila][columna] = barco;
        tablero.getMatriz()[fila][columna + 1] = barco;
        tablero.getMatriz()[fila][columna + 2] = barco;
    }

    /**
      * Método que ubica aleatoriamente el barco 'F' que ocupa cuatro casillas horizontalmente
      * Tiempo constante: O(1) Tiempo constante
      */
    private void colocarBarco4() {
        Random random = new Random();
        int TAMANO = tablero.getTAMANO();
        int fila = random.nextInt(TAMANO);
        int columna = random.nextInt(TAMANO - 3);

        while (tablero.getMatriz()[fila][columna] != '*' || tablero.getMatriz()[fila][columna + 1] != '*' ||
                tablero.getMatriz()[fila][columna + 2] != '*' || tablero.getMatriz()[fila][columna + 3] != '*') {
            fila = random.nextInt(TAMANO);
            columna = random.nextInt(TAMANO - 3);
        }

        char barco = 'F'; // 'F'
        tablero.getMatriz()[fila][columna] = barco;
        tablero.getMatriz()[fila][columna + 1] = barco;
        tablero.getMatriz()[fila][columna + 2] = barco;
        tablero.getMatriz()[fila][columna + 3] = barco;
    }
}
