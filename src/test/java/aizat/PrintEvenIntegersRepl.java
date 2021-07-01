package aizat;

public class PrintEvenIntegersRepl {
    public static void main(String[] args) {
        /**
         * Write a for loop that prints all even integers from 80 through and including 20.
         * Seperate each number with a space
         */

        for(int i = 80; i < 20; i--){
            if(i % 4 == 0  && i % 2 ==0) {
                System.out.println(i + "even integers");
            }else if( i % 20 == 0){
                System.out.println(i + "integers are printed");
            }else{
                System.out.println("All numbers odd");
            }
        }

    }
}
