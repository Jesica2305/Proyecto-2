public class Tablero {
    private char[][] matriz;
    private int TAMANO;

    public Tablero(int TAMANO) {
        this.TAMANO = TAMANO;
        matriz = new char[TAMANO][TAMANO];
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public int getTAMANO() {
        return TAMANO;
    }

    public void inicializarMatriz() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                matriz[i][j] = '*';
            }
        }
    }

    public void imprimirMatriz() {
        System.out.println("Matriz con barcos:");
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void setMatriz(char[][] matriz) {
        this.matriz = this.matriz;
    }
}

