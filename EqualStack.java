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

public class EqualStack {
    
    
         
       // System.out.println(sum1 + ""+sum2 + "" +sum3);
            
    
    
    public static void main(String[] args){
    
       Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();

      Stack<Integer> stack1 = new Stack<Integer>();
      Stack<Integer> stack2 = new Stack<Integer>();
      Stack<Integer> stack3 = new Stack<Integer>();

        //filling elements in the array and calculating sum of the elements
      int h1 = 0;
      int[] h1Array = new int[n1];
      for(int h1_i=0; h1_i < n1; h1_i++){
          h1Array[h1_i] = in.nextInt();
          h1 += h1Array[h1_i];

      }
        //filling elements in the stack
      for(int i=0;i<n1;i++){
          stack1.push(h1Array[n1-1-i]);
      }

        //filling element in array 2 and calculating sum of the elements.
      int h2 = 0;
      int[] h2Array = new int[n2];
      for(int h2_i=0; h2_i < n2; h2_i++){
          h2Array[h2_i] = in.nextInt();
          h2 += h2Array[h2_i];
      }
        
        //pushing elements in stack2.
       for(int i=0;i<n2;i++){
          stack2.push(h2Array[n2-1-i]);
      }

        //filling elements in the array3 and calculating sum of elements.
      int h3 = 0;
      int[] h3Array = new int[n3];
      for(int h3_i=0; h3_i < n3; h3_i++){
          h3Array[h3_i] = in.nextInt();
          h3 += h3Array[h3_i];
      }
        
       //filling elements in the stack3 
       for(int i=0;i<n3;i++){
          stack3.push(h3Array[n3-1-i]);
      }

        //looping till the sums are not equal , i.e equal size cylinders are present
    while(h1!=h2 || h1!=h3 ){
        //base case if any of the stack is empty then return 0
        if(stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty()){
            System.out.println(0);System.exit(0);
        }
        //if sum1 is greater then we will pop the peek of stack1.
        if(h1== findMax(h1, h2, h3)){
            h1 = h1 - stack1.peek();
            stack1.pop();
        } 
         //if sum2 is greater then we will pop the peek of stack2.
        else if(h2== findMax(h1, h2, h3)){
            h2 = h2 - stack2.peek();
            stack2.pop();
        }
         //if sum3 is greater then we will pop the peek of stack3.
        else{
            h3 = h3 - stack3.peek();
            stack3.pop();
        }
    }
    System.out.println(h1);

}

private static int findMax(int h1, int h2, int h3) {
    return Math.max(Math.max(h1, h2), h3);
}

    
}
