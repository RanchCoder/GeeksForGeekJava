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

public class InsertionSort {
    
    
    public static void main(String[] args){
        
        int[] A = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements :: ");
        for(int i = 0  ; i < A.length ; i++){
            
            A[i] = sc.nextInt();
            
        }
        
        for(int j = 1 ; j < A.length ; j++){
        
            int key = A[j];
            
            int i = j - 1;
            
            while(i >= 0 && A[i] > key){
            
                A[i+1] = A[i];
            
                i = i - 1;
            }
            
            A[i+1] = key;
        
        
        }
    
        for(int a : A){
        
            System.out.print(a + " ");
        
        }
    
    }
    
    
}
