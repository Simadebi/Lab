import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        // Define the 2D array
        int[][] array = {{3, 8, 2}, {7, 5, 10},{12, 6, 4}};
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();
        scanner.close();

        boolean found = false;

        // Search for the element in the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    System.out.println("Element " + target + " found at position: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        // If the element is not found
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}