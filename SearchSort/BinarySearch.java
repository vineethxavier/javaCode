package SearchSort;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 5, 6, 3, 40, 50, 43};
        int find = 400;
        int foundAt = binarySearch(arr, find);
        System.out.println("found at :" + (foundAt < 0 ? "notfound":(foundAt+1)));

    }
    private static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length -1;
        String srtArr = Arrays.toString(arr);
        System.out.println("before sorting:" + srtArr);
        Arrays.sort(arr);
        srtArr = Arrays.toString(arr);
        System.out.println("sorted array: "+srtArr);
        while(start <= end){
            int mid = (start +end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if( key < mid){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}

