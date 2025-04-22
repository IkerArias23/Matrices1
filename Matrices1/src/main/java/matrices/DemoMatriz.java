package matrices;

/**
 * Clase de demostración para la Matriz.
 */
public class DemoMatriz {
    public static void main(String[] args) {
        System.out.println("Demo 1: Matriz 2x2");
        Matriz matrizCuadrada = new Matriz(new int[][]{{1, 2}, {3, 4}});
        System.out.println("Original:");
        matrizCuadrada.imprimirMatriz();

        System.out.println("\nTranspuesta:");
        Matriz transpuestaCuadrada = matrizCuadrada.obtenerTranspuesta();
        transpuestaCuadrada.imprimirMatriz();

        System.out.println("\nDemo 2: Matriz 2x3");
        Matriz matrizRect = new Matriz(new int[][]{{5, 6, 7}, {8, 9, 10}});
        System.out.println("Original:");
        matrizRect.imprimirMatriz();

        System.out.println("\nTranspuesta:");
        Matriz transpuestaRect = matrizRect.obtenerTranspuesta();
        transpuestaRect.imprimirMatriz();

        System.out.println("\nDimensiones:");
        System.out.printf("Original: %dx%d%n",
                matrizRect.obtenerNumeroFilas(), matrizRect.obtenerNumeroColumnas());
        System.out.printf("Transpuesta: %dx%d%n",
                transpuestaRect.obtenerNumeroFilas(), transpuestaRect.obtenerNumeroColumnas());

        System.out.println("\nAcceso puntual:");
        System.out.printf("Original[1][2]: %d%n",
                matrizRect.obtenerElemento(1, 2));
        System.out.printf("Transpuesta[2][1]: %d%n",
                transpuestaRect.obtenerElemento(2, 1));
    }
}
