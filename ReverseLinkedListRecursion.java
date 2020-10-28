
/*package whatever //do not write package name here */

import java.io.*;

class DoublyLinkedListNode{
   
   private int data;
   private DoublyLinkedListNode prev;
   private DoublyLinkedListNode next;
   
   public DoublyLinkedListNode(int data){
       this.data = data;
       this.prev = null;
       this.next = null;
   }
   
   public void setNext(DoublyLinkedListNode node){
       this.next = node;
   }
   
   public void setPrev(DoublyLinkedListNode node){
       this.prev = node;
   }
   
   public DoublyLinkedListNode getNext(){
       return this.next;
   }
   
   public DoublyLinkedListNode getPrev(){
       return this.prev;
   }
  
   public int getData(){
       return this.data;
   }
    
}


public class ReverseLinkedListRecursion {
    
    public DoublyLinkedListNode head, tail;
    
    public ReverseLinkedListRecursion(){
        head = null;
        tail = null;
    }
    
    
    public void insert(int data){
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        if(head == null){
            System.out.println("yes here for " + data);
            head = tail =  node;
        }
        else{
                node.setPrev(tail);
                tail.setNext(node);
                tail = node;
                
        }
            
        
    }
    
    //method to reverse Linkedlist using technique of recursion and changing pointer of a node one at a time.
    
    public DoublyLinkedListNode reverse(DoublyLinkedListNode node1){
      
        if(node1 == null){
            return null;
        }
        
            
        DoublyLinkedListNode node = node1;  //store the address of the current node
        DoublyLinkedListNode temp = reverse(node1.getNext()); // recursion call till it reaches last node and then traverses back up.
        node.setNext(node.getPrev());
        node.setPrev(temp);
        
        if(node.getPrev() == null){
            head = node;  // the head node will be the last node now
        }
        if(node.getNext() == null){
            tail = node;
        }
        
        return node;
        
           
    }
        
        
    
    
    
    
    public DoublyLinkedListNode print(DoublyLinkedListNode node){
            
    	    if(node == null){
    	    	return null;
    	    }
    	
            System.out.print(node.getData());
            if(node.getNext() != null){
            	System.out.print("->");
            }
            node = node.getNext();
            print(node);
            
            return node;
            
        }
    
    
	public static void main (String[] args) {
		ReverseLinkedListRecursion ll = new ReverseLinkedListRecursion();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		System.out.println(ll.head.getData());
	    ll.print(ll.head);
		ll.reverse(ll.head);
		System.out.println();
		ll.print(ll.head);
		
	}
}
