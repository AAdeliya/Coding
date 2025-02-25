package org.example;

public class NumberPalindronome {
    public static void main(String[] args) {
        System.out.println(isPal());
    }

    public static boolean isPal(int num) {
        int copyOfOrifinal  = num;
        int reversedNumber = 0;
        int remainder;

        while ( num > 0) {
            remainder = num % 10;

            reversedNumber = (reversedNumber * 10) + remainder;
            //remove most right number from num
            num = num/10;
        }

        return reversedNumber == copyOfOrifinal;
    }

}
