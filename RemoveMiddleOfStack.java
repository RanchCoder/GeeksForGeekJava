/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsGeeksForGeeks;

/**
 *
 * @author Dell
 */

import java.util.*;
import java.io.*;
public class RemoveMiddleOfStack {
    
    public static void RemoveMiddle(Stack s){
    
        int sz = s.size();
        System.out.println("the size of stack is :: " + sz);
        int mid = sz / 2;
        if(sz%2 == 0){
        
            s.remove(mid - 1);
            
        
        }
        
        else{
            
            s.remove(mid);
        
        
        }
        
       Iterator itr = s.iterator();
       
       while(itr.hasNext()){
       
       
           System.out.println(itr.next());
           
       }
        
    }
    
    
    public static void main(String[] args) throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.valueOf(br.readLine());
        
        while(testcase != 0){
            //creating new stack in every interation of test cases.
            Stack<Integer> st = new Stack<>();
            
            //accepting the value of n elements that are to be inserted into the stack.
            
            int n = Integer.valueOf(br.readLine());
            
            //pushing elements in the stack.
            for(int i = 0 ; i < n ; i++){
            
                st.push(Integer.valueOf(br.readLine()));
            
            }
        
        testcase = testcase - 1;
        RemoveMiddle(st);
        }
        
    }
    
}
