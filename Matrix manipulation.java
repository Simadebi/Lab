public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6} };
         int[][] matrixB = { {7, 8}, {9, 10} , {11, 12} };
        int rowsA = matrixA.length;       // Number of rows in A
        int colsA = matrixA[0].length;    // Number of columns in A
        int rowsB = matrixB.length;       // Number of rows in B
        int colsB = matrixB[0].length;    // Number of columns in B

        // Check if multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }
        // Resultant matrix
        int[][] result = new int[rowsA][colsB];

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Print the resultant matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}