import java.io.*;
import java.util.*;

public class TrapRainwater{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int baayein = 0;
        int daayein = arr.length-1;
        int paani = 0;
        int maxBaayein = arr[baayein];
        int maxDaayein = arr[daayein];
        
        while(baayein<daayein){
            if(arr[baayein] <= arr[daayein]){
                baayein++;
                maxBaayein = Math.max(maxBaayein, arr[baayein]);
                paani = paani+ (maxBaayein-arr[baayein]);
                // System.out.println(paani);
            }
            else{
                daayein--;
                maxDaayein = Math.max(maxDaayein, arr[daayein]);
                paani = paani + (maxDaayein-arr[daayein]);
            }
        }
        System.out.println(paani);
    }
}