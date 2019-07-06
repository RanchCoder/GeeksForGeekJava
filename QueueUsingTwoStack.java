import java.io.*;
import java.util.*;

public class QueueUsingTwoStack {

     static Stack<Long> oldStack = new Stack<Long>();
     static Stack<Long> newStack = new Stack<Long>();
    
    public static void Pushing(long ele){
        
        oldStack.push(ele);
    }
   //stack shuffle is used to transfer all the elements of old stack to new stack only if the new stack has been already dequeued 
    public static void stackShuffle(){
        
        if(newStack.isEmpty()){
            
            while(!oldStack.isEmpty()){
                
                //pushing the element removed from oldStack so that the old comes on top.
                newStack.push(oldStack.pop());
                
            }
            
        }
        
    }
    //peek the element at the top of the queue
    public static long peeking(){
        
        stackShuffle();
        return newStack.peek();
        
    }
    
    //removing the element at the top of the queue
    public static long removing(){
        
        //stack shuffle is used to tranfer  purpose from orginal stack to temporary stack
        stackShuffle();
        return newStack.pop();
        
        
    }
    
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        long element;
        while(n != 0){
            
            int i = Integer.valueOf(br.readLine());
            if(i == 1){
                
                element = Long.valueOf(br.readLine());
                Pushing(element);
            }
            if(i == 2){
                
                long get =  removing();
               // System.out.println(get);
                
            }
            if(i == 3){
                
                long get = peeking();
                System.out.println(get);
            }
            
            
            n = n - 1;
        }
        
        
    }
}