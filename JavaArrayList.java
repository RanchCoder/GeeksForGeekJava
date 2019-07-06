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

public class JavaArrayList {
    
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        int n = sc.nextInt(); 
        
        while(n != 0){
         
            int d = sc.nextInt(); // no of digits in a list
            
            ArrayList<Integer> temp = new ArrayList<>();
            
            for(int i = 0 ; i < d ; i++){
            
               
                 temp.add(sc.nextInt());
            
            }
            arr.add(temp);
            
            n = n - 1;
            
        
        }
        
        int q = sc.nextInt(); // no of queries
            
        
            while(q != 0){
            
                int x = sc.nextInt(); //list Number
                int y = sc.nextInt(); //Index Number
                
               
                 if(arr.get(x-1).isEmpty() != true && y - 1  < arr.get(x - 1).size()){
                    if(arr.get(x - 1).get(y - 1) != 0){
                 
                    System.out.println(arr.get(x - 1).get(y - 1));
                
                }
                }
                else{
                 
                     System.out.println("ERROR");
                }
                
                 
                
             
                q = q -  1;
            
            }
            
       
    
    }
    
    
}
