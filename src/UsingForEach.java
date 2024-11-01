/*
Using a For-Each style For loop to find the sum of
the elements of an array
 */
public class UsingForEach {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        //Using the For-Each loop to display and sum the elements of an array
        for(int x : numbers){
            System.out.println("Element value: " + x);
            sum +=x;
        }
        System.out.println("The sum of all elements of the array is: " + sum);

    }
}
