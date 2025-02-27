package org.example;

public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray(); //"hello" 'h','e','l','l','o'
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }

                while (start < end && vowels.indexOf(word[end]) == -1) {
                    end--;
            }

            char tmp = word[start];
            word[start] = word[end];
            word[end] = tmp;

            start++;
            end--;
        }
        String answer = new String(word);
        return answer;
    }

}
