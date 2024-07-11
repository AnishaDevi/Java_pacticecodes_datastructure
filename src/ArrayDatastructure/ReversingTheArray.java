package ArrayDatastructure;
import java.util.Scanner;

public class ReversingTheArray {
    //can pass n instead of original_arr.length.
    public static int[] reverse_arr(int[] original_arr)
    {
        int n = original_arr.length;
        int[] reversed_arr = new int[n];
        for(int i=0 ; i<n;i++)
        {
            reversed_arr[i] = original_arr[n-i-1];
        }
        return reversed_arr;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] original_arr = new int[n];
        System.out.println("Enter the String:");
        for(int i = 0 ; i < n ; i++)
        {
            original_arr[i] = sc.nextInt();
        }
        System.out.println("The Original array is:");
        for(int i : original_arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Array after reversing:");
        int[] reversed_arr = reverse_arr(original_arr);
        for(int i : reversed_arr)
        {
            System.out.print(i+" ");
        }

    }
}
