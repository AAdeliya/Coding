package org.example;

public class GuessNumberHigherorLower {
    public int guessNumber(int n) {
    int low = 0;
     int high = n;
     int ans = 0;

     while (true) {
         int mid = low + (high -low)/2;
         if (guess(mid) == -1) {
             high = mid;
         }

         else if (guess(mid) == 1) {
             low = mid + 1;
         } else {
             ans = mid;
             break;
         }
      }

     retuen ans;
}}
