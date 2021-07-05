package aizat;

public class PrintEvenIntegersRepl {
    public static void main(String[] args) {
        /**
         * Write a for loop that prints all even integers from 80 through and including 20.
         * Seperate each number with a space
         */

        for(int i = 80; i < 20; i--){
            if(i % 2 == 0) {
                System.out.println(i + "even integers");
            }else{
                System.out.println("All numbers odd");
            }
        }

    }
}
