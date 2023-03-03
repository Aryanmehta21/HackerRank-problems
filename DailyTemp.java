import java.io.*;
import java.util.*;

public class DailyTemp {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()])
                ans[st.peek()] = i - st.pop();

            st.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}