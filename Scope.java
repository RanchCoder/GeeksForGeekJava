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
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

        // Add your code here
      Difference(int[] element){
     
         elements = new int[element.length];
         
         elements = java.util.Arrays.copyOf(element,element.length);
     }
  
    void computeDifference(){
       
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int a : elements){
            
            if(a > max){
                
                max = a;
                System.out.println("max = "+ a);
            }
            
             if(a < min){
                
                min = a;
                System.out.println("min = "+ a);
            }
                    
        }
        
        int difference  = Math.abs(max - min);
        maximumDifference = difference;
       
   }
   } // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}