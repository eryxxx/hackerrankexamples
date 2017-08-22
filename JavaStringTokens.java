import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String[] splitted = s.trim().split("[ .,?!'@_]+");
        System.out.println(splitted.length);
        if(splitted.length==0){
            System.out.println(" ");
        }else{
           for(int i=0;i<splitted.length;i++){
             System.out.println(splitted[i]);
        } 
        }
        
    }
}