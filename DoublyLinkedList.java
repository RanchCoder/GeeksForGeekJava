class DllNode{
    
    private int data;
    private DllNode prev;
    private DllNode next;
    
    public DllNode(int data){
        this.data = data;
        prev = null;
        next = null;
    }
    
    public DllNode(int data , DllNode prev,DllNode next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    
    
    public int getData(){
        return data;
    }
    
    public DllNode getNext(){
        return next;
        
    }
    
    public DllNode getPrev(){
        return prev;
        
    }
    
    public void setPrev(DllNode node){
        prev = node;
        
    }
    
    public void setNext(DllNode node){
        next = node;
        
    }
}

public class DoublyLinkedList{
    
    private DllNode head;
    private DllNode tail;
    private int length;
    
    public DoublyLinkedList(){
        
        head = new DllNode(Integer.MIN_VALUE,null,null);
        tail = new DllNode(Integer.MIN_VALUE,head,null);
        head.setNext(tail);
        length = 0;
        
    }
    
    public int getPosition(int data){
        DllNode temp = head;
        int pos = 0;
        while(temp != null){
            if(temp.getData() == data){
                return pos;
            }
            pos+=1;
            temp = temp.getNext();
        }
        return Integer.MIN_VALUE;   
    }
    
    public int getLength(){
        return length;
    }
    public void insertAtHead(int value){
        DllNode node = new DllNode(value,null,null);
        
        //if our list is null
        if(length == 0){
            head.setNext(node);
            node.setPrev(head);
            
            tail.setPrev(node);
            node.setNext(tail);
            length++;
            return;
        }
        //if we have more than one element in list.
        else{
        node.setNext(head.getNext());
        node.setPrev(head);
        head.setNext(node);
        length += 1;
    
        }
        
        
    }
    public void insertAt(int data , int position){
        
        
        if(position < 0){
            position = 0;
        }
        if(position > length){
            position = length;
        }
        
        //when want to insert at head
        if(position == 0){
            insertAtHead(data);
            return;
        }
        
        //when we want to insert at tail
        if(position == length){
            insertAtTail(data);
            return;
        }
        DllNode node ,  temp = head.getNext();
        for(int i = 1 ; i < position ; i++){
            
            temp = temp.getNext();
            
        }
        System.out.println("temp data : "  + temp.getData());
        //we have reached a position before now.
        node = new DllNode(data,null,null);
        
        node.setNext(temp.getNext());
        temp.getNext().setPrev(node);
        temp.setNext(node);
        
        
        length += 1;
        
        
        
        
        
    }
    public void insertAtTail(int data){
        
        DllNode node = new DllNode(data,null,null);
        if(length == 0){
            insertAtHead(data);
            return;
        }else{
            
            tail.getPrev().setNext(node);
            node.setPrev(tail.getPrev());
            tail.setPrev(node);
            length += 1;
        }
        
    }
    // removing the first element 
    public int removeFirst(){
        //if no element in the list
        if(length == 0){
            return Integer.MIN_VALUE;
        }
        DllNode temp = head.getNext();
        head.setNext(temp.getNext());
        temp.getNext().setPrev(head);
        length -= 1;
        return temp.getData();
        
    }
    //removing last element
    public int removeLast(){
        //if no element in list
        if(length == 0){
            return Integer.MIN_VALUE;
        }
        DllNode temp = tail.getPrev();
        tail.setPrev(temp.getPrev());
        temp.getPrev().setNext(tail);
        length -= 1;
        return temp.getData();
        
    }
    
    
    public synchronized void removeAtPosition(int position){
        if(position < 0){
            position = 0;
        }
        //if position greater than the no of elements starting from 0
        if(position > length - 1){
            position = length - 1;
        }
        // to remove first element
        if(position == 0){
            removeFirst();
            return;
        }
        //to remove last element
        if(position == (length - 1)){
            removeLast();
            return;
        }
        //else to remove in between element
        DllNode temp = head.getNext();
        for(int i = 1 ; i < position ; i++){
            temp = temp.getNext();
        }
        
        
        
        temp.setNext(temp.getNext().getNext());  // since we reach one element before actual position , we need to set the next of current node to 
                                                 //next of actual position node , so we skip the actual position node and reach its next node.
        temp.getNext().setPrev(temp);          // now setting prev of node after position node to point to node before position node.
         length -= 1;
         return;
         
    }
    
    
    public synchronized void removeMatched(DllNode node){
        
        if(length == 0){
            return;
        }
        DllNode temp = head.getNext();
        int pos = 0;
        while(pos < length){
            if(node.equals(temp)){
                temp.getPrev().setNext(temp.getNext());
                temp.getNext().setPrev(temp.getPrev());
                length -= 1;
                
            }
            pos += 1;
        }
        
        
    }
    public String toString(){
        
        String result = "[";
        DllNode node = head.getNext();
        
        for(int i = 0 ; i < length ; i++){
            System.out.println("Node data at " + i +" is " + node.getData());
            result += node.getData();
           if(i < length - 1){
               result += ",";
           }
            node = node.getNext();
        }
        result += "]";
        return result;
        
    }
    
    
    public static void main(String[] args){
        
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtHead(5);
        System.out.println(dll.toString());
    
        dll.insertAtHead(15);
        System.out.println(dll.toString());
        
        dll.insertAtTail(25);
        System.out.println(dll.toString());
        
        
        dll.removeAtPosition(2);
        System.out.println(dll.toString());
        
        
        
        
        // dll.removeFirst();
        // System.out.println(dll.toString());
        
        
        // dll.removeLast();
        // System.out.println(dll.toString());
        
        
        // dll.insertAt(35,1);
        // System.out.println(dll.toString());
        
    }
        
}
