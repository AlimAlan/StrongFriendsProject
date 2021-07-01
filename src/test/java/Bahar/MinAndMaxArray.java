package Bahar;

public class MinAndMaxArray {
    public static void main(String[] args) {
        int[] number = {500,300,8,6,-4,200};
        int max = number[0];
        int min = number[0];
        for (int i =0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }else if(number[i] < min){
                min = number[i];
            }
        }
        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);
    }
}
