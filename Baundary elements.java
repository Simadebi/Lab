public class BoundaryElements {
    public static void printBoundaryElements(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Top row
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[0][j] + " ");
        }

        // Right column (excluding first and last elements)
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(arr[i][cols - 1] + " ");
        }

        // Bottom row (if more than one row)
        if (rows > 1) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(arr[rows - 1][j] + " ");
            }
        }

        // Left column (excluding first and last elements)
        if (cols > 1) {
            for (int i = rows - 2; i > 0; i--) {
                System.out.print(arr[i][0] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Boundary elements of the array:");
        printBoundaryElements(array);
    }
}

