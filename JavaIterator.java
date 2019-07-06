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

public class JavaIterator {
   
    public static Iterator myFun(ArrayList mylist){
    
        Iterator itr = mylist.iterator();
        
           while(itr.hasNext()){
            
               Object element = itr.next();
               
               if(element instanceof String)
              // System.out.println("Iterator stopped at :: "+element);
               break;
           }
        
        return itr;
    
    }

public static void main(String[] args){
 
    ArrayList mylist = new ArrayList();
    
    mylist.add(1);
    mylist.add(2);
    mylist.add(3);
    mylist.add("Hello");
    mylist.add(5);
    mylist.add(6);
    mylist.add(7);
    
    Iterator itr = myFun(mylist);
    while(itr.hasNext()){
    
     
        Object element1  = itr.next();
        System.out.println(element1);
    }
}    
}
