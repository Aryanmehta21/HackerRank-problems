import java.io.*;
import java.util.*;

public class buyAndSellStock {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }else{
                maxProfit = Math.max(maxProfit, arr[i] - minPrice);
            }
        }
        
        System.out.println(maxProfit);
    }
}