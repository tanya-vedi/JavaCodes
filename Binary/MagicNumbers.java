// { Driver Code Starts
//Initial Template for Java
//Link: https://practice.geeksforgeeks.org/problems/faithful-numbers0014/1 
/*A number is called faithful if you can write it as the sum of distinct powers of 7. 
e.g.,  2457 = 7 + 72 + 74 . If we order all the faithful numbers, we get the sequence 1 = 70, 7 = 71, 8 = 70 + 71, 49 = 72, 50 = 70 + 72 . . . and so on.
Given some value of N, you have to find the N'th faithful number.
*/


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.nthFaithfulNum(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long nthFaithfulNum(int N) {
       Double sum = 0.0;
       int count = 0;
       int rem = 0;
       while ( N != 0) {
           rem = N%2;
           N/=2;
           sum += Math.pow(7,count)*rem;
           count++;
       }
       return sum.longValue();
    }
};
