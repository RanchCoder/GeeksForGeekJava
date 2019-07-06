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


public class RansomNote {
 
    
    public static String checkRansom(String[] magWord,String[] noteWord){
      
        HashMap<String ,Integer> magazine = new HashMap<String , Integer>();
        
        //inserting each word in the magazine map and along with its counter value in the string
        for(String m : magWord){
        
        
            if(magazine.containsKey(m)){
            
            
                magazine.put(m,magazine.get(m) + 1);
            
            }
            else{
                
                magazine.put(m, 1);
            
            
            }
            
        
        
        }
        //looping over noteword array and finding if magazine contains that word or not
        for(String n : noteWord){
        
        //if not the we simply return a no.
            if(!magazine.containsKey(n)){
             
                return "No";
            
            
            }
            //if yes then we adjust counter to the frequecy of word - 1
            int counter = magazine.get(n) - 1;
            
            if(counter == 0){
             
                magazine.remove(n);
            
            }
            // now we put back again that word along with its updated frequency into the array.
            else{
              
                magazine.put(n,counter);
            
            }
        
        }
        
     return "Yes";
    }
    
    public static void main(String[] args) throws IOException{
    
        
      // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Scanner sc = new Scanner(System.in);
       
       int m = sc.nextInt();
       int n = sc.nextInt();
       String[] mag = new String[m];
       String[] note = new String[n];
       
      
       for(int i = 0 ; i < m ; i++){
        
           mag[i] = sc.next();
       
       
       }
       
       for(int j = 0 ; j < n ; j++){
       
       
           note[j] = sc.next();
       
       }
       
      String str = checkRansom(mag,note);
      
      System.out.println(str);
    
    }
    
    
    
}
