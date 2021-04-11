package HackerRank;

import java.util.Vector;

public class TargetNumer {

    static int findTotalWays(Vector<Integer> arr, int i, int k)
    {

        // If target is reached, return 1
        if (k == 0 && i == arr.size()) {
            return 1;
        }

        // If all elements are processed and
        // target is not reached, return 0
        if (i >= arr.size()) {
            return 0;
        }

        // Return total count of three cases
        // 1. Don't consider current element
        // 2. Consider current element and subtract it from target
        // 3. Consider current element and add it to target
        return findTotalWays(arr, i + 1, k)
                + findTotalWays(arr, i + 1, k - arr.get(i))
                + findTotalWays(arr, i + 1, k + arr.get(i));
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { -3, 1, 3, 5 };
        Vector<Integer> v = new Vector<Integer>();
        for (int a : arr) {
            v.add(a);
        }

        // target number
        int k = 6;

        System.out.println(findTotalWays(v, 0, k));
    }
}
