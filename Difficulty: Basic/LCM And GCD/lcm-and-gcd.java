//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

// User function Template for Java

class Solution {
    static boolean isprime(int x){
        for(int i=2;i<x/2;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    static int findHCF(int x, int y){
        int smaller, greater;
        smaller = (x < y) ? x : y;
        greater = (x > y) ? x : y;
        for(int i=smaller;i>0;i--){
            if(x%i==0 && y%i==0){
                return i;
            }
        }
        return 1;
    }
    public static int[] lcmAndGcd(int a, int b) {
        int [] arr=new int[2];
        if(a==b) {arr[0]=a; arr[1]=a; return arr; }
        else if(a%b==0) {arr[0]=a; arr[1]=b; return arr;}
        else if(b%a==0){arr[0]=b; arr[1]=a; return arr;}
        else if(isprime(a)|| isprime(b)){arr[0]=a*b; arr[1]=1; return arr;}
        else{
            arr[1]=findHCF(a,b); arr[0]=(a*b)/arr[1];
            return arr;
        }
    
    }
}

//{ Driver Code Starts.

// } Driver Code Ends