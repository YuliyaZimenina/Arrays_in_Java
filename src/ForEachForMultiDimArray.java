
// Using For-Each to operate on a two-dimensional array

public class ForEachForMultiDimArray {
    public static void main(String[] args) {
        int sum = 0;
        int[][] numbers = new int[3][5];

        // Fill the array with values
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                numbers[i][j] = (i + 1) * (j + 1);
        // Using For-Each to display and sum array values
        for (int[] x : numbers) {
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
