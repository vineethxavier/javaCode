package CrackingTheCode;

import java.util.Arrays;

/**
 * Question: 2 strings, is one permutation of other
 *
 * Solutions
 * 1) sort and see if both strings are same
 * 2) Iterate through each characters and make if its there in other string
 * 3) create a ASCII int array and increment the count for each character for both the strings and check( implemented below)
 */
public class CheckPermutation1dot2 {
    public static void main(String[] args) {
        String a = "123";
        String b = "cba";
        System.out.println(isPermutable(a,b));
    }

    /**
     * Method to check if 2 strings have same characters with same number of times.
     *
     * @param a string
     * @param b string
     * @return boolean
     */
    private static boolean isPermutable(String a ,String b){
        if(a.length() != b.length()){
            return false;
        }
        int[] aArr = new int[128];
        int[] bArr = new int[128];
        for (int i = 0; i < a.length(); i++) {
           int aVal=  a.charAt(i);
           aArr[aVal] = aArr[aVal] +1;

           int bVal=  b.charAt(i);
           bArr[bVal] = bArr[bVal] +1;
        }
        if(Arrays.equals(aArr,bArr)){
            return true;
        }
        return false;
    }
}
