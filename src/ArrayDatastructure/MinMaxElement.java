package ArrayDatastructure;
import java.util.Scanner;

public class MinMaxElement
{
    public static int getMinVal(int[] arr,int n)
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int getMaxVal(int[] arr,int n)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum value in the array: "+getMinVal(arr,n));
        System.out.println("Maximum value in the array: "+getMaxVal(arr,n));
    }
}
