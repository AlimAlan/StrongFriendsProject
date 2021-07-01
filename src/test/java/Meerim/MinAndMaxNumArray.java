package Meerim;

public class MinAndMaxNumArray {
    public static void main(String[] args) {
        int[] arr={1,4,6,8,90,234,67};
        System.out.println("Minimum number from Array => "+minNum(arr));
        System.out.println("Maximum number from Array => "+maxNum(arr));
    }
    public static int minNum(int[]num){
        int temp=num[0];
        for(int i=0;i<num.length;i++){
            if(temp<num[i]){
                temp=num[i];
            }
        }
        return temp;
    }
    public static int maxNum(int[]num){
        int temp=num[0];
        for(int i=0; i<num.length;i++){
            temp=num[i];
        }
        return temp;
    }
}
