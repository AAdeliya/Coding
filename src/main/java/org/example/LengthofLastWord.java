package org.example;

public class LengthofLastWord {
    public int lengthOfLastWord (String s) {
        String trimmed = s.trim();
        int lastIndexOf = trimmed.lastIndexOf(' ');
        String lastWord = trimmed.substring(lastIndexOf + 1);
        int length = lastWord.length();
        return length;
    }

}
