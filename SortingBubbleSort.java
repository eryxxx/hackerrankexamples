import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
         bs(a, n);
}

public static void bs (int[] a, int n){
int number = 0;
for (int i = 0; i < n; i++) {
// Track number of elements swapped during a single array traversal
int numberOfSwaps = 0;
for (int j = 0; j < n - 1 - i; j++) {
    // Swap adjacent elements if they are in decreasing order
    if (a[j] > a[j + 1]) {
        int temp = a[j];
        a[j] = a[j + 1];
        a[j + 1] = temp;
        numberOfSwaps++;
    }
}
 number+= numberOfSwaps;
// If no elements were swapped during a traversal, array is sorted
if (numberOfSwaps == 0) {
    break;
}
}
System.out.println("Array is sorted in " + number + " swaps.");
System.out.println("First Element: " + a[0]);
System.out.println("Last Element: " + a[n-1]);
}
    }