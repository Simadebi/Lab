public class RowColumnSum {
    public static void main(String[] args) {
        int[][] array = {
            {3, 8, 2},
            {7, 5, 10},
            {12, 6, 4}
        };

        int rows = array.length;
        int cols = array[0].length;

        // Calculate and print row-wise sum
        System.out.println("Row-wise Sum:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += array[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        // Calculate and print column-wise sum
        System.out.println("\nColumn-wise Sum:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += array[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }
    }
}