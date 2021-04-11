package CrackingTheCode;

/*
    Question:
    Efficiently check if a string has all unique characters without using any additional data structure
    page 90

    Just for ASCII not included Unicode(
    ASCII - A-Z, a-z 0-9 and symbols like !@#$ etc
    unicode- english + Arabic + Greek etc
*/
/* important things to remember
    * bool array by default null
    * Arrays.fill(boolArr.false)  // to fil up the array with false
 */
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class IsUnique1Dot1 {
    public static void main(String[] args) {
        String choice;
        do {
            System.out.println("  type 1 - to enter the string.\n type anything else to exit");
             choice = getString();
            switch (choice) {
                case "1":
                    System.out.println("enter the string");
                    String str = getString();
                    System.out.println(isUnique(str) ? "unique" : "not-unique");
                    break;
                case "0":
                    System.out.println("exiting");
                default:
                    System.out.println("thanks!");
                    exit(0);
            }
        }while(choice!="1");
     /*   String x = "vineth";
        System.out.println(isUnique(x));*/
    }

    /**
     * Method to check of string has unique characters.
     *
     * @param str String
     * @return Boolean
     */
    private static Boolean isUnique(String str){
        if(str.length() >128){
            return false;
        }
        Boolean[] boolArray = new Boolean[128];
        //Arrays.fill(boolArray,false);
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            System.out.println("int values of "+str.charAt(i)+" is "+ val);
            if(boolArray[val] == null) {
                boolArray[val] = true;
            }else{
                return false;
            }
        }
        return true;
    }

    /**
     * Method reads string ans returns it.
     *
     * @return string
     */
    private static String getString(){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
       // sc.close();
        return x;
    }
}
