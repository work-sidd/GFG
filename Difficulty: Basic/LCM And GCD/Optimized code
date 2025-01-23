class Solution {
    static int findHCF(int x, int y) {
        //the euclidean algo, faster then looping for large numbers !
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
    public static int[] lcmAndGcd(int a, int b) {
        //All the if cases and isprime() thing you wrote was redundant, works perfectly fine for this simple code as well !
        int[] arr = new int[2];
        arr[1] = findHCF(a, b); // HCF
        arr[0] = (a / arr[1]) * b; // LCM, avoiding overflow, as a and b if large can cross the Integer.MAX_VALUE range, thus                                         divide a first to lower the whole eqn, mathematically it is similar to doing (a*b)/arr[1]                             
        return arr;
    }
}
