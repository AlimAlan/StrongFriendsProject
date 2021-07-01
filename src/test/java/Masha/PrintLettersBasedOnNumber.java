package Masha;

public class PrintLettersBasedOnNumber {
    public static void main(String[] args) {
        //output * aaaaaabbbbccde
        //input  * a6b4c2d1e1

        String str = "a6b4c2d1e1";
        String let = "";
        for (int i = 0; i < str.length(); i++) {
            int number = 0;
            if (Character.isDigit(str.charAt(i))) {
                number = Integer.parseInt(Character.toString(str.charAt(i)));
                for (int k = 0; k < number; k++) {
                    let += str.charAt(i - 1) + "";
                }
                let+=""+number;
            }
        }
        System.out.println(let);
    }
}

