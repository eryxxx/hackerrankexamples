// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int k=1;
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
        if(A[i]>0 && A[i]==k){
            k++;
        }else{
            k=k;}
        
        
        }
        
        return k;
        
    }
}