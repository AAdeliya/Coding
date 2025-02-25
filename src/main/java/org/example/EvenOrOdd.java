package org.example;

public class EvenOrOdd {

    public static void main(String[] args) {
        evenOrOdd(5);
    }

    public static void evenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("Odd");
        }
    }

}
