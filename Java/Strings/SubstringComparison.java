// Given a string, s , and an integer, k , complete the function so that it finds
// the lexicographically smallest and largest substrings of length k .

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> arr = new ArrayList();
        
        // finding all of the substrings of 3 in String s
        // add all of the substring to Arraylist
        for(int i = 0; i < s.length()- (k-1) ; i++){
            arr.add(s.substring(i, i + k));
        }
        
        // using collection to sort the arraylist
        Collections.sort(arr);

        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = arr.get(0);
        largest = arr.get(arr.size() - 1);
         

        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
