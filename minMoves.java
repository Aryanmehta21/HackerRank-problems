import java.io.*;
import java.util.*;

public class minMoves {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i =0;
        int j = arr.length-1;
        int count = 0;
        while(i<j){
            count = count + (arr[j] - arr[i]);
            i++;
            j--;
        }
        System.out.println(count);
    }
}