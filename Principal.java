import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TAMANO = 7;
        Tablero tablero = new Tablero(TAMANO);
        Barco barco = new Barco(tablero);
        Disparos disparos = new Disparos(tablero);

        tablero.inicializarMatriz();
        barco.colocarBarcos();
        tablero.imprimirMatriz();

        int barcosRestantes = 13; // Inicialmente hay 6 barcos
        boolean disparoAcertado = true;

        /*
        se crea el siguiente bucle para que el juego continue si los barcos restantes son mayores a 0.
        complejidad temporal: O(N) Tiempo Lineal.
        */
        while (barcosRestantes > 0) {
            System.out.print("Ingrese una coordenada (fila columna): ");
            int filaUsuario = scanner.nextInt();
            int columnaUsuario = scanner.nextInt();

            /*
            se verifica si le disparo a un barco.
            */
            disparoAcertado = disparos.verificarCoordenada(filaUsuario, columnaUsuario);
            /*
            si le dispara a un barco se decrementan los barcosRestantes
            */
            if (disparoAcertado == true) {
                barcosRestantes--;

                if (barcosRestantes == 0) {
                    System.out.println("¡Has hundido todos los barcos!");
                    tablero.imprimirMatriz();
                    break;
                }
            }
            tablero.imprimirMatriz();
        }
        /*
        El juego se termina si no queda ningun barco en la matriz
        */
        System.out.println("Fin del juego.");
    }
}
