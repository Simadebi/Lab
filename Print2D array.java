public class Print2DArray {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] array = {
            {3, 8, 2},
            {7, 5, 10},
            {12, 6, 4}
        };

        // Print the 2D array
        System.out.println("2D Array Elements:");
        for (int i = 0; i < array.length; i++) {  
            for (int j = 0; j < array[i].length; j++) { 
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
