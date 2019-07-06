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

public class SubStringProblem {
    
    public static void getSmallestAndLargest(String s , int k){
    
         java.util.ArrayList<String> atr = new java.util.ArrayList<String>();
          
            for(int i = 0 ; i < s.length() - (k - 1); i++){
        String sp = "";
           for(int j = i ; j < i + k ; j++){
        
               sp = sp + s.charAt(j);
               
               
               
           
           }
          // System.out.println(sp);
           atr.add(sp);
        
         
        }
    
        Collections.sort(atr);
        
        System.out.println(atr.get(0) +"\n"+atr.get(atr.size()-1));
    
    
    
    }
    
    public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
   
        int k = sc.nextInt();
        getSmallestAndLargest(s,k);
    }
    
}
