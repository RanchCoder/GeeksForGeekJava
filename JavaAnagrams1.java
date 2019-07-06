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
public class JavaAnagrams1 {

 
static boolean isAnagram(String a, String b) {
        // Complete the function
        java.util.HashMap<Character,Integer> hst = new java.util.HashMap<Character,Integer>();
        java.util.HashMap<Character,Integer> hst1 = new java.util.HashMap<Character,Integer>();
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        
        for(char c : a.toCharArray()){
            
            if(hst.containsKey(c)){
                
                int value = hst.get(c) + 1;
                hst.put(c,value);
            }
            else{
                
                 hst.put(c,1);
                
            }
            
            
        }
        
        
        for(char c : b.toCharArray()){
            
            if(hst1.containsKey(c)){
                
                int value = hst1.get(c) + 1;
                hst1.put(c,value);
            }
            else{
                
                 hst1.put(c,1);
                
            }
            
            
        }
        int count = 0;
        for(char c : a.toCharArray()){
            int difference = 0;
             if(hst1.containsKey(c)){
                 
                 difference = Math.abs(hst1.get(c) - hst.get(c));
                 count = count + difference;
                 hst1.remove(c);             
             }
            
        }
        
        for(char c : b.toCharArray()){
            
            if(hst1.isEmpty() == false){
                
                if(hst1.containsKey(c)){
                    
                    count = count + 1;
                    
                }
                
            }
            
        }
        
      System.out.println(count);
    if(count == 0){
        
        return true;
    }
        else{
            
            return false;
            
        }
        
        
    }
     public static void main(String[] args) throws IOException{
      
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String a = br.readLine();
         String b = br.readLine();
         
         boolean resul = isAnagram(a,b);
         
         if(resul == true){
          
             System.out.println("Anagrams");
         }
         else{
           
              System.out.println("Not Anagrams");
         }
     
     }
     
}
