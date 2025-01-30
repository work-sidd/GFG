//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().quickSort(arr, 0, n - 1);
            printArray(arr);
        }
    }
}
// } Driver Code Ends


class Solution {
    static void swap(int arr[],int x, int y){
        int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
    }
    static void quickSort(int arr[], int low, int high) {
        if(low<high){
            int loc=partition(arr, low, high);
            quickSort(arr,low,loc-1);
            quickSort(arr,loc+1,high);
        }
    }
    static int partition(int arr[], int low, int high) {
        int pivot=arr[low];
        int i=low, j=high;
        while(i<j){
            while(arr[i]<=pivot && i<high){i++;}
            while(arr[j]>pivot && j>low){j--;}
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
        }
        
    }

