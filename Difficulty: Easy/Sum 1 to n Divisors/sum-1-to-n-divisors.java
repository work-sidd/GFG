//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            int ans = ob.sumOfDivisors(N);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
 
    static ArrayList<Integer> findDivisors(int x) {
        ArrayList<Integer> al = new ArrayList<>();
        int sqrtX = (int) Math.sqrt(x); 
        for (int i = 1; i <= sqrtX; i++) {
            if (x % i == 0) {
                al.add(i);
                if (i != x / i) { /*adding pair of divisors, and avoiding
                                    adding the square root twice*/
                    al.add(x / i);
                }
            }
        }
        return al;
    }
    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> al = findDivisors(i);
            for (Integer divisor : al) {
                sum += divisor;
            }
        }
        return sum;
    }
}
