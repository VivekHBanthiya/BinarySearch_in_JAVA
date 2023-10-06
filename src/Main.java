import java.util.*;
// Time Complexity : O(N)
// Space Complexity : O(1)
// Auxiliary Space Complexity : O(N) due to function call stack
public class Main
{
    public static int BinarySearch(int[] arr, int item, int left, int right)
    {
        while (left<=right){
            int mid = left + (right - left)/2; //to find mid of an element
            if(arr[mid] == item)
            {
                return mid;
            }
            if (arr[mid] < item)
            {
                left = mid+1;
            }
            else
                right = mid -1;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of an array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i=0; i<size; i++)
        {
            System.out.print("Enter " + i + " element in an array: ");
            arr[i] = sc.nextInt(); //array input
        }

        System.out.print("Enter element to be search in an array: ");
        int item = sc.nextInt();
        int position = BinarySearch(arr, item, 0, arr.length-1 ); //storing binary return value in int positiom
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        if(position == -1)
        {
            System.out.println("Element is not present");
        }
        else
        {
            System.out.println("Element is found at " + position + " index in an array");
        }
        System.out.println("--------------------------------------------------------------------");

    }
}
