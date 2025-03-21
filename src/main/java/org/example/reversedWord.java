package org.example;

public class reversedWord {
    public String reversedWord(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String w: words) {
            StringBuilder reversedString = new StringBuilder(w);
            reversedString.reverse();
            result.append(reversedString).append(" ");

        }

        return result.toString().trim();
    }
}

//
//char[] chars = s.toCharArray();
//int start = 0;
//for (int i = 0; i< chars.length; i++) {
//        if (chars[i] == ' ' || i == chars.length - 1) {
//int end = (i == chars.length - 1 && chars[i] != ' ') ? i + 1 : i;
//while (start < end) {
//char temp = chars[start];
//chars[start] = chars[end - 1];
//chars[end - 1] = temp;
//start++;
//end--;
//}
//start = i + 1;
//}
//}
//return new String(chars);