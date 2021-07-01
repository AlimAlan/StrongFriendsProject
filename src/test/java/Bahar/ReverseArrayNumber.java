package Bahar;

import java.util.Arrays;

public class ReverseArrayNumber {
    public static void main(String[] args) {
        // Reverse the Array number and print
        int [] number = {1,5,8,6,2};
        int[] reverseNumber = new int[number.length];
        for (int i = number.length-1 , j = 0; i>=0; i--, j++){
            reverseNumber[j] = number[i];
        }
        System.out.println(Arrays.toString(reverseNumber));

    }

}
