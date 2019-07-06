/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.util.*;

public class JavaLoops{
    
    public static void main(String[] args){
    
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int sum = 0;
         int a = sc.nextInt();
         int b = sc.nextInt();
         int ans = 0;
         for(int i = 0 ; i < n ; i++){
          ans = 0;
          sum = 0;
             for(int j = 0 ; j <= i ; j++){
             
                 sum = sum + ((int)Math.pow(2,j) * b);
             
             }
             
             ans = a + sum;
             System.out.print(ans + " ");
         
         }
     
    }
     
}
