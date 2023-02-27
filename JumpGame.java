import java.io.*;
import java.util.*;

public class JumpGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int max = 0;
        for(int i =0;i<arr.length;i++){
            if(i>max){
                System.out.println("false");
                return;
            }
            max = Math.max(max,arr[i] + i);
        }
        
        System.out.println("true");
    }
}