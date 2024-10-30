public class CopyingAnArray {
    public static void main(String[] args) {
        int i;
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        for (i = 0; i < firstArray.length; i++)
            firstArray[i] = i;

        System.out.print("First array: ");
        for (i = 0; i < firstArray.length; i++)
            System.out.print(firstArray[i] + " ");

        System.out.println();

        //Copying the firstArray to the secondArray
        if (secondArray.length >= firstArray.length)
            for (i = 0; i < firstArray.length; i++)
                secondArray[i] = firstArray[i];

        System.out.print("Second array: ");
        for (i = 0; i < secondArray.length; i++)
            System.out.print(secondArray[i] + " ");

    }
}
