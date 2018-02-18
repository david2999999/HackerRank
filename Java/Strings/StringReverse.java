//Given a string A, print Yes if it is a palindrome, print No otherwise.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int front = 0, rear = A.length() - 1;
        boolean flag = true;
        
        while(front < rear){
            if(A.charAt(front) != A.charAt(rear)){
                System.out.println("No");
                flag = false;
                break;
            }
            
            front++; rear--;
        }
        
        if(flag){
            System.out.println("Yes");
        }

    }
}
