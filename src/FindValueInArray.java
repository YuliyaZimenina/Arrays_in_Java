// Using an enhanced For loop, find a value in an unsorted array.
public class FindValueInArray {
    public static void main(String[] args) {
        int [] numbers = {6, 8, 3, 7, 5, 6, 1, 4};
        int value = 5;
        boolean found = false;

        // Use For-Each to search
        for(int x : numbers){
            if (x == value){
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Value found!");
    }
}
