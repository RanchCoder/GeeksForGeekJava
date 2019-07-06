import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Testing{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        long m = sc.nextLong();
        
        long arr[] = new long[n];
        
        
         
        
        
        for(int j = 1 ; j <= m ; j++){
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
             
            arr[a] += k;
            
            if(b < n){
                
                arr[b+1] -= k;
                
            }
                 
           
        }
        long sum = arr[1];
        long max = arr[1];
        for(int i = 2; i < n + 1 ; i++){
            
             sum =sum + arr[i];
            if(max < sum){
                
                 max = sum;
                
            }
        }
        
        System.out.println(max);
    }
    
}