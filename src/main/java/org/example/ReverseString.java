package org.example;

public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0, right = s.length-1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

}


////recursion solution
//public void reverseString(char[] s) {}
//reverse(s, 0, s.length-1);
//}
//private void reverse(char[] s, int left, int right) {
//    if (left >= right) return;
//    char temp = s[left];
//    s[left] = s[right];
//    s[right] = temp;
//    reverse(s, left+1, right-1);
//}