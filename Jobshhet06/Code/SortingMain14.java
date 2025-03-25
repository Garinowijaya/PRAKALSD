public class SortingMain14 {
    public static void main(String[] args) {
        int[] a = {34,7,23,32,5,62};
        //declare an array named b[]
        int[] b = {30,20,2,8,14};
        //import java.util.Scanner;
        int[] c = {40,10,4,9,3};

        Sorting14 sorting1 = new Sorting14(a);
        //create a new obj (B)
        Sorting14 sorting2 = new Sorting14(b);
        //create a new obj (c)
        Sorting14 sorting3 = new Sorting14(c);
        
        System.out.println("\nOriginal array : ");
        sorting1.print();
        sorting1.bubbleSort();
        System.out.println("Sorted array (Bubble Sort) : ");
        sorting1.print();

        //call for sorting 2
        System.out.println("\nOriginal array : ");
        sorting2.print();
        sorting2.bubbleSort();
        System.out.println("Sorted array (Bubble Sort) : ");
        sorting2.print();

        //call for sorting 3
        System.out.println("\nOriginal array : ");
        sorting3.print();
        sorting3.bubbleSort();
        System.out.println("Sorted array (Bubble Sort) : ");
        sorting3.print();
    }
}
