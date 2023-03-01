import java.io.*;
import java.util.*;

public class maxSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = arr[0];
        int currSum = 0;
        for(int i =0;i<arr.length;i++){
            currSum = currSum + arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum<0){
                currSum = 0;
            }
        }
        System.out.println(maxSum);
        
    }
}