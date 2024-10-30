//Assigning values to variable that reference arrays
public class ReferenceAssignment {
    public static void main(String[] args) {
        int i;
        int [] numberArray1 = new int[10];
        int [] numberArray2 = new int[10];

        for (i = 0; i < 10; i++)
            numberArray1[i] = i;

        for (i = 0; i < 10; i++)
            numberArray2[i] = - i;

        System.out.print("First array: ");
        for (i = 0; i < 10; i++)
            System.out.print(numberArray1[i] + " ");
        System.out.println();

        System.out.print("Second array: ");
        for (i = 0; i < 10; i++)
            System.out.print(numberArray2[i] + " ");
        System.out.println();

        numberArray2 = numberArray1; //Assign a reference to an array

        System.out.print("Second array after reference assignment: ");
        for (i = 0; i < 10; i++)
            System.out.print(numberArray2[i] + " ");
        System.out.println();

        //Operate the first (numberArray1) array through the second (numberArray2)
        numberArray2[3] = 99;

        System.out.print("First array after modification through second array: ");
        for (i = 0; i < 10; i++)
            System.out.print(numberArray1[i] + " ");
        System.out.println();

    }
}
