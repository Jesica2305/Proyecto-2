public class Tablero {
    private char[][] matriz;
    private int TAMANO;

    /**
      * Constructor que recibe el tamaño del tablero como parametro
      * Inicializa la matriz con el tamaño especificado
      * Complejidad Temporal: O(1) Tiempo constante
      */
    public Tablero(int TAMANO) {
        this.TAMANO = TAMANO;
        matriz = new char[TAMANO][TAMANO];
    }
    /**
      * Método para obtener la matriz
      * @return Retorna la matriz
      * Complejidad Temporal: O(1) Tiempo constante
      */
    public char[][] getMatriz() {
        return matriz;
    }
    
    /**
      * Método para obtener el tamaño
      * @return Retorna el tamaño
      * Complejidad Temporal: O(1) Tiempo constante
      */
    public int getTAMANO() {
        return TAMANO;
    }

    /**
      * Se inicia la matriz con asteriscos
      * Complejidad Temporal: O(N^2) Complejidad cuadrática
      */
    public void inicializarMatriz() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                matriz[i][j] = '*';
            }
        }
    }

    /**
      * Se imprime la matriz 
      * Complejidad Temporal: O(N^2) Complejidad cuadrática
      */
    public void imprimirMatriz() {
        System.out.println("Matriz con barcos:");
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
      * Se actualiza la matriz del tablero
      * Complejidad Temporal: O(1) Tiempo constante
      */
    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }
}

