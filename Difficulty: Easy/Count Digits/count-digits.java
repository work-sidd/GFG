//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static int evenlyDivides(int n) {
        int digit;
        int temp=n;
        int cnt=0;
        while(n!=0){
            digit=n%10;
            if(digit==0){n/=10;continue;}
            if(temp%digit==0){cnt++;}
            n/=10;
            
        }
        return cnt;
    }
}