//Working with an array via variable length
public class LengthDemo {
    public static void main(String[] args) {
        int[] list = new int[10];
        int[] num = {1, 2, 3};
        int[][] table = {  // Table with rows of different lengths
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        System.out.println("Length of array List: " + list.length);
        System.out.println("Length of array Numbers: " + num.length);
        System.out.println("Length of array Table: " + table.length);
        System.out.println("Length of array Table, row 1 / table[0]: " + table[0].length);
        System.out.println("Length of array Table, row 2 / table[1]: " + table[1].length);
        System.out.println("Length of array Table, row 3 / table[2]: " + table[2].length);
        System.out.println();

        //Use the Length variable to initialize the List array
        for (int i = 0; i < list.length; i++)
            list[i] = i * i;
        System.out.print("Array Contents List: ");
        //Use the Length variable to display the contents of the List array
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
