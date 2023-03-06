import java.util.*;

public class minMeetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        // Taking input in two separate arrays
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        int count = 1; // initialize count to 1
        int j = 0;
        // Sorting both arrays in ascending order of start times
        Arrays.sort(start);
        Arrays.sort(end);

        for (int i = 1; i < n; i++) {
            // Check if the next meeting starts before the previous one ends
            if (start[i] < end[j]) {
                count++; // Need an additional room
            } else {
                j++; // Previous meeting ended, move to the next one
            }
        }

        System.out.println(count);
    }
}
