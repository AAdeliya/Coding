package org.example;

public class StringPool {
    public static void main(String[] args) {
        String str = "apple";
        String str1 = "apple";
        String str2 = new String("apple");


        System.out.println(str == str1); //true
        System.out.println(str == str2); // false
        System.out.println(str.equals(str2)); // true

        //true because they are pointing to the same object
        //in string pool == compares id they are pointing to the same object in

        //2.false
        //new String different string pool

        //3.true because equals compares values


    }
}
