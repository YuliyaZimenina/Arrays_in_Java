/*
Write a program that stores the number of passengers who traveled to
the airport by express bus.
The bus runs 10 times on weekdays and 2 times on Saturday and Sunday
 */
public class NumberOfPassengers {
    public static void main(String[] args) {

        //Declaration of a two-dimensional array with the first dimension defined
        int[][] riders = new int[7][];
        //Manual allocation of memory for the indices of the second dimension of array
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];

        // Formation of fictitious data
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 10; j++)
                riders[i][j] = i + j + 10;
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 2; j++)
                riders[i][j] = i + j + 10;

        System.out.println("Number of passengers per flight on weekdays: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        System.out.println("Number of passengers per flight on weekend: ");
        for (int i = 5; i < 7; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
    }
}
