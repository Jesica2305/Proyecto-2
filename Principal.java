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

        while (barcosRestantes > 0) {
            System.out.print("Ingrese una coordenada (fila columna): ");
            int filaUsuario = scanner.nextInt();
            int columnaUsuario = scanner.nextInt();
            disparoAcertado = disparos.verificarCoordenada(filaUsuario, columnaUsuario);
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

        System.out.println("Fin del juego.");
    }
}
