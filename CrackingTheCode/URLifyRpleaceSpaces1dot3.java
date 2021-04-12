package CrackingTheCode;

import CollectionExample.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class URLifyRpleaceSpaces1dot3 {
    public static void main(String[] args) {
        String s = "mr john smith       ";
        char[] str = s.toCharArray();
        int n = 13;
        replaceSpace(str, n);
    }

    private static void replaceSpace(char[] str, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        if(spaceCount ==0){
            System.out.println(Arrays.toString(str));
            return;
        }
        int charArrSize = trueLength - spaceCount + (spaceCount * 3);
        char[] finalCharArr = new char[charArrSize];
        int index =0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                finalCharArr[index] = '%';
                finalCharArr[index + 1] = '2';
                finalCharArr[index + 2] = '0';
                index = index + 3;
            } else {
                finalCharArr[index] = str[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(finalCharArr));
        System.out.println();
        for (int i = 0; i < finalCharArr.length; i++) {
            System.out.print(finalCharArr[i]);
        }
    }

   /* private static void replaceSpace(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' '){
                spaceCount++;
            }
        }
        index = trueLength +spaceCount *2;
        if(trueLength <str.length) str[trueLength] = '\0';

        for(i=trueLength-1;i>=0;i--){
            if(str[i] == ' '){
                str[index -1 ]= '0';
                str[index -2 ]= '2';
                str[index -3 ]= '%';
                index = index-3;
            }else{
            str[index - 1] = str[i];
            index--;
            }
        }
        System.out.println(str);

    }*/
}
