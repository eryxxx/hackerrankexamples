import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
        long n = in.nextLong();
        long c,a,b;
        long sum;
        c=0;
        a=1;
        b=2;
        sum=2;
        while(c<n){
            c=a+b;
            a=b;
            b=c;
            if(c%2==0)
            {
                sum+=c;
                if(c>n)
                {
                 sum=sum-c;   
                }
            }

            }
        n=0;

        System.out.println(sum);
    }
}}