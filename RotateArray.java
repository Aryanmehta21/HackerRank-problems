import java.io.*;
import java.util.*;

public class RotateArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
    Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        
        int k=scn.nextInt();
        
        rotate(arr,k);
        
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    
    
    public static void rotate(int[]arr,int k){
        k=k%arr.length;
        if(k<0){
            k+=arr.length;
        }
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    
    public static void reverse(int[]arr,int li, int ri){
        
        while(li<ri){
            int temp=arr[li];
            arr[li]=arr[ri];
            arr[ri]=temp;
            li++;
            ri--;
        }
    }
    
   
    }