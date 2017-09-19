import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        ArrayList<Integer> mList = new ArrayList<Integer>();
        ArrayList<Integer> mList2 = new ArrayList<Integer>();
        for(int k=3;k < n;k++){
            if(k % 15 == 0 ){
               mList.add(k); 
            }
            else if(k % 3 == 0 ){
               mList.add(k); 
            }
            else if(k % 5 == 0 ){
               mList.add(k); 
            }else{
                continue;
            }
            
            
        }
         for(int k=3;k < m;k++){
            if(k % 15 == 0 ){
               mList2.add(k); 
            }
            else if(k % 3 == 0 ){
               mList2.add(k); 
            }
            else if(k % 5 == 0 ){
               mList2.add(k); 
            }else{
                continue;
            }
            
            
        }
        
        int sum =0;
        int sum2 =0;
        for(int i=0;i<mList.size();i++){
            sum=sum+ mList.get(i);
        }
         for(int i=0;i<mList2.size();i++){
            sum2=sum2+ mList2.get(i);
        }
        System.out.println(sum);
        System.out.println(sum2);
    }
}
***************************************************
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
       long [] numbers = new long[n];

    for (int i = 0 ; i < n ; i++)
        {
        numbers[i] = sc.nextLong();
        long three = (numbers[i] - 1)/3;
        long five = (numbers[i] - 1)/5;
        long fifthteen = (numbers[i] - 1) /15;
        System.out.println(3*(three*(three+1)/2)+5*(five*(five+1)/2)-15*(fifthteen*(fifthteen+1)/2));

    }
    }
}
