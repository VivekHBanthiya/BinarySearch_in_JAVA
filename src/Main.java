import java.util.*;
// Time Complexity : O(N)
// Space Complexity : O(1)
// Auxiliary Space Complexity : O(N) due to function call stack
public class Main {
    public static int BinarySearch(int[] arr, int item, int left, int right){
        while (left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid] == item){
                return mid;
            }
            if (arr[mid] < item) {
                left = mid+1;
            }
            else
                right = mid -1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int item = sc.nextInt();
        int position = BinarySearch(arr, item, 0, arr.length-1 );
        if(position == -1){
            System.out.println("element is not present");
        }
        else{
            System.out.println("element found at " + position);
        }
    }
}
