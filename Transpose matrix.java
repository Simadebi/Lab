public class MatrixTranspose {
    public static void main(String[] args) {
        // Define the original matrix
        int[][] matrix = {  {1, 2, 3},  {4, 5, 6} };
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a new matrix for the transpose
        int[][] transpose = new int[cols][rows];

        // Compute the transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Print the transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transpose);
    }
    
    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

    


