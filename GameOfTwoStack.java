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

public class GameOfTwoStack {
    
    
    public static void gameOTS(int[] a , int[] b){
        
        
        
        
        
    
    
    
    }
    
    
    public static void main(String[] args)throws IOException{
    
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        
        int g = Integer.valueOf(br.readLine());
        
        while(g != 0){
        
            //size of the two stacks for each games
            int n = Integer.valueOf(br.readLine());
            int m = Integer.valueOf(br.readLine());
            
            //using two array to collect the input 
            int[] a = new int[n];
            int[] b = new int[m];
            
            for(int i = 0 ; i < n ; i++){
            
                a[i] = Integer.valueOf(br.readLine().split(" ")[i]);
            
            
            }
            
            for(int i = 0 ; i < m ; i++){
            
                b[i] = Integer.valueOf(br.readLine().split(" ")[i]);
            
            
            }
            
            gameOTS(a,b);
            
            
            
            
        g = g - 1;
        }
     
        
    
    }
    
}
