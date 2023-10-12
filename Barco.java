import java.util.Random;

public class Barco {
    private Tablero tablero;

    public Barco(Tablero tablero) {
        this.tablero = tablero;
    }

    public void colocarBarcos() {
        colocarBarco1();
        colocarBarco2();
        colocarBarco3();
        colocarBarco4();
    }

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
