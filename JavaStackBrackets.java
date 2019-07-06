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


public class JavaStackBrackets {
    
    Scanner sc  = new Scanner(System.in);
    static char[][] Token = {{'{','}'},{'[',']'},{'(',')'}};
   
    public static boolean isOpenTerm(char C){
     
        for(char[] check : Token){
             
             if(check[0] == C){
               
                 return true;
             
             }
             
        
        }
        
        return false;
    }
    
    public static boolean matches(char openTerm,char closedTerm){
    
        for(char[] check : Token){
        
            if(check[0] == openTerm){
                
                 
                 return check[1] == closedTerm;
        
           }
          
        }
        
        return false;
        
    }
    
    public static boolean isBalancedString(String expression){
     
       Stack<Character> stc = new Stack<Character>();
       
       for(char c : expression.toCharArray()){
        
            if(isOpenTerm(c) == true){
               
                stc.push(c);
            
            }
            
            else{
                
                if(stc.isEmpty() || !matches(stc.pop(),c)){
                 
                    return false;
                
                }
            
            }
       
       }
       
      return stc.isEmpty();
    }
    
     public static void main(String[] args){
       
          Scanner sc = new Scanner(System.in);
          String s = sc.next();
          
         boolean result =  isBalancedString(s);
         
         if(result == true){
           
              System.out.println("Balanced");
         
         }
         else{
           
                System.out.println("Not Balanced");
         
         }
     }
    
}
