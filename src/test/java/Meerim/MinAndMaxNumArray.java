package Meerim;

public class MinAndMaxNumArray {
    public static void main(String[] args) {
        int[] arr={1,4,6,8,90,234,67};
        minAndMaxNum(arr);
    }
    public static void minAndMaxNum(int[]num) {
        int max = num[0];
        int min = num[0];
        int temp = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max=num[i];

            }else if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Maximum number => "+max);
        System.out.println("Minimum number => "+min);
    }
}
