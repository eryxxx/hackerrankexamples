import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i=0, j=0, tempSum=0, negArray=0;
        while(i<n){
        arr[i] = sc.nextInt();
            if(arr[i]<0){
          negArray++;        
            }
         j = i;
         tempSum += arr[j];
        while(j>0){ 
          tempSum += arr[--j];
             if(tempSum < 0){
             negArray++;
          }
      }
      tempSum = 0;
      i++;
    }
    System.out.println(negArray);
    }
}