import java.util.*;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = sc.nextInt();
        }
        int t = nums1.length + nums2.length;
        int ans = 0;
        double val = 0;
        int k = 0;
        int c[] = new int[t];
        for (int i = 0; i < nums1.length; i++) {
            c[i] = nums1[i];
        }
        for (int i = nums1.length; i < t; i++) {
            c[i] = nums2[k];
            k++;
        }

        Arrays.sort(c);

        for (int i = 0; i < t; i++) {
            if (t % 2 == 0) {
                ans = t / 2;
                val = (long) (c[ans] + c[ans - 1]);
                val = val / 2;
            } else {
                ans = t / 2;
                val = c[ans];
            }
        }
        System.out.println(val);

    }
}
