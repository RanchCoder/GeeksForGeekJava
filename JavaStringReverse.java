/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.io.*;
import java.util.*;

public class JavaStringReverse {
    
  
        public static void main(String[] args){
         
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            
            char[] c = s.toCharArray();
            
            int a = c.length;
            
           // System.out.println("String length is :: "+ a);
           
          char[] test = new char[c.length];
        for(int i = 0 ; i < test.length; i++){
            
          test[i] =  c[(a - i) - 1];
            
            
        }
       
        String test2 = String.valueOf(test);
             if(test2.equals(s)){
              
                 System.out.println("Yes");
             
             }
             
             else{
                 
                 System.out.println("No");
             
             }
           
    
}
}