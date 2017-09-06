import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution { public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int max = 0, min = 100, answr = 0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if(min > a[a_i]) {min = a[a_i];}
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            if(max < b[b_i]) {max = b[b_i];}
        }
        for(int i = min; i <= max; i++){
            for(int j = 0; j < n; j++){
                if(i%a[j] == 0){
                    if(j == n-1){
                        for(int k = 0; k < m; k++){
                            if(b[k]%i == 0){
                                if(k == m-1){
                                    answr++;
                                }
                            }
                            else {k = m;}
                        }
                    }
                }
                else{j = n;}
            }
        }
        System.out.println(answr);
    }
}