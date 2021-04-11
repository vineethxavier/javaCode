package HackerRank;

import java.util.Arrays;

public class UniqueRandomArraySumsToZero {
    public static void main(String[] args) {
        int[] arr = sumZero(3);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] sumZero(int n)
    {
        int[] retArr = new int[n];

            for (int i = 0; i < n / 2; i++) {
                retArr[i] = i + 1;
                retArr[n - i - 1] = i - (i * 2) - 1;
            }
        return retArr;
    }
}
