import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
         int[] c={0,0,0,0,0};
        for(int i=0;i<ar.length;i++){
            if(ar[i]==1){
               c[0]++;  
            }
            
            if(ar[i]==2){
                c[1]++;
            }
            if(ar[i]==3){
               c[2]++; 
            }
            if(ar[i]==4){
               c[3]++; 
            }
            if(ar[i]==5){
               c[4]++;
            }
           
        }
        
      int max=c[0],k=0;
        for(int j=1;j<5;j++){
            if(c[j]>max){
                k=j;
                max=c[j];}
        }

    
    return k+1;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
