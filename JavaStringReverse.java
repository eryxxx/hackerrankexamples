import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int k=A.length();
        String answer="Yes";
		// String revA = new StringBuilder(A).reverse().toString();
        if (k<50)
        {
            for (int i=0;i<k/2;i++){
            
            if(A.charAt(i)==A.charAt(k-i-1))
                continue;
            else{
                answer ="No";
                break;
            }
        }
        System.out.println(answer);}
        
    }
}
