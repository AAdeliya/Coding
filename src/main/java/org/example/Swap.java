package org.example;

public class Swap {
    public static void main(String[] args) {
        int j = 15;
        int  i = 10;

        j = j - i; //15-10; j  = 5
        i = i + j; // i = 10+5; i = 15
        j = i - j; // j  = 15 - 5; j  = 10;
    }
}
