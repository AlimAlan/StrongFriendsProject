package aizat;

import java.util.Scanner;

public class FirstLetterWithUpperCase {

    /**
     * Write a program that will print out information about user based on email.
     * Print first name, last name, and domain.
     * First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
     *
     * Example:
     *
     * Input: craig_federighi@apple.com
     * Input: craig_federighi@apple.com
     * Output:
     * First name: Craig
     * Last name: Federighi
     * Domain: apple
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName, lastName, domain;

        firstName = email.substring(0, 1).toUpperCase() + email.substring(1);
        System.out.print(firstName);

        lastName = email.substring(0,1).toUpperCase() + email.substring(1);
        System.out.print(lastName);

        domain = email.substring(0);
        System.out.print(domain);

    }

}


