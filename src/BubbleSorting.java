// Arrays sorting (bubble sort)

public class BubbleSorting {
    public static void main(String[] args) {
        int[] numbers = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size = 10; // Numbers of elements to sort

        //Display the original array
        System.out.print("The original array:\n{");
        for (int i = 0; i < size; i++)
            System.out.print(numbers[i] + " ");
        System.out.print("}");
        System.out.println();

        //Bubble sort
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                // If the order isn't observed, we swap the array elements
                if (numbers[b - 1] > numbers[b]) {
                    t = numbers[b - 1];
                    numbers[b - 1] = numbers[b];
                    numbers[b] = t;
                }
            }
        //Display the sorted array
        System.out.print("The sorted array:\n{");
        for (int i = 0; i < size; i++)
            System.out.print(numbers[i] + " ");
        System.out.print("}");
        System.out.println();
    }
}