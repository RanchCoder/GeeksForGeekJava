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
import java.io.*;

public class Anagrams {
    
   static public  void check(String A, String B){
     
       HashMap<Character,Integer> hs1 = new HashMap<Character,Integer>(26);
       HashMap<Character,Integer> hs2 = new HashMap<Character,Integer>(26);
       
       for(char c : A.toCharArray()){
         
            if(hs1.containsKey(c) == true){
               
                 int value = hs1.get(c);
                 value = value + 1;
                 
                 hs1.put(c, value);
            
            }
            
            else{
                
                hs1.put(c,1);
            
            
            }
        
       }
       
       for(char c :B.toCharArray()){
         
            if(hs2.containsKey(c) == true){
               
                 int value1 = hs2.get(c);
                 value1 = value1 + 1;
                 
                 hs2.put(c, value1);
            
            }
            
            else{
                
                hs2.put(c,1);
            
            
            }
        
       }
       
       int count = 0;
       for(char c : hs1.keySet()){
       int difference = 0;
       
           if(hs2.containsKey(c)){
             
               difference = Math.abs(hs2.get(c) - hs1.get(c));
               count = count + difference;
              hs2.remove(c);
           }
           
           else{
           
              count = count + hs1.get(c);
               
           }
           
       
       }
       
       for(char ch : hs2.keySet()){
       
           count = count + hs2.get(ch);
       
       }
       
     
       
       
//       for(Map.Entry m : hs1.entrySet()){
//       
//           System.out.println(m.getKey() + " -> " + m.getValue() + "\n");
//       }
//       
//       for(Map.Entry m2 : hs2.entrySet()){
//       
//           System.out.println(m2.getKey() + " -> " + m2.getValue() + "\n");
//       }
       System.out.println("Count is ::" + count);
    }
    
    public static void main(String[] args)throws Exception{ 
    
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         String a = br.readLine();
         
         String b  = br.readLine();
         
         check(a,b);
         
    }
    
}
