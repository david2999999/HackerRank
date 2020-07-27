//Two strings,  A and B, are called anagrams if they contain all the same characters in the same frequencies. 
//For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.


import java.io.*;
import java.util.*;

public class Solution {
    
        static boolean isAnagram(String a, String b) {
            if(a.length() != b.length()){
                return false;
            }else{
                char[] aLowerCase = a.toLowerCase().toCharArray();
                char[] bLowerCase = b.toLowerCase().toCharArray();
                
                Arrays.sort(aLowerCase); 
                Arrays.sort(bLowerCase);
                
                return Arrays.equals(aLowerCase, bLowerCase);
            }
  
        }
        
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
}