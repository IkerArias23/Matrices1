package matrices;

/**
 * Representación de una matriz de enteros y operaciones básicas.
 */
public class Matriz {
    private final int[][] datos;
    private final int numeroFilas;
    private final int numeroColumnas;

    /**
     * Construye una matriz copiando los valores dados.
     *
     * @param valores arreglo bidimensional con los datos iniciales
     */
    public Matriz(int[][] valores) {
        this.numeroFilas = valores.length;
        this.numeroColumnas = (numeroFilas > 0) ? valores[0].length : 0;
        this.datos = new int[numeroFilas][numeroColumnas];

        for (int fila = 0; fila < numeroFilas; fila++) {
            for (int col = 0; col < numeroColumnas; col++) {
                this.datos[fila][col] = valores[fila][col];
            }
        }
    }

    /** Imprime la matriz en consola, fila a fila. */
    public void imprimirMatriz() {
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                System.out.print(this.datos[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Devuelve una nueva Matriz que es la transpuesta de esta.
     * @return matriz transpuesta
     */
    public Matriz obtenerTranspuesta() {
        int[][] copia = new int[numeroColumnas][numeroFilas];
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                copia[j][i] = this.datos[i][j];
            }
        }
        return new Matriz(copia);
    }

    /** @return número de filas */
    public int obtenerNumeroFilas() {
        return numeroFilas;
    }

    /** @return número de columnas */
    public int obtenerNumeroColumnas() {
        return numeroColumnas;
    }

    /**
     * @param fila    índice de fila
     * @param columna índice de columna
     * @return valor en esa posición
     * @throws IndexOutOfBoundsException si fila/columna fuera de rango
     */
    public int obtenerElemento(int fila, int columna) {
        if (fila < 0 || fila >= numeroFilas || columna < 0 || columna >= numeroColumnas) {
            throw new IndexOutOfBoundsException(
                    String.format("Índice fuera de rango: [%d][%d]", fila, columna));
        }
        return this.datos[fila][columna];
    }
}
