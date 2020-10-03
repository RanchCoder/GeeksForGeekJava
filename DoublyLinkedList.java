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
        
        if(length == 0){
            head.setNext(node);
            node.setPrev(head);
            
            tail.setPrev(node);
            node.setNext(tail);
            length += 1;
            return;
        }
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
        
        
        DllNode node ,  temp = head;
        
        if(head == null){
            head = new DllNode(data);
            tail.setPrev(head);
            head.setNext(tail);
        }
        
        //when want to insert at head
        if(position == 0){
            
            insertAtHead(data);
            
        }
        else if(position == length){
            
            insertAtTail(data);
            
        }    
        else{
        
        for(int i = 1 ; i <= position ; i++){
            
            temp = temp.getNext();
            
        }
        
        
        
        //we have reached a position before now.
       
        node = new DllNode(data,null,null);
        
        node.setNext(temp.getNext());
        node.setPrev(temp);
        
        temp.getNext().setPrev(node);
        temp.setNext(node);
        length += 1;
        }
        
        
        
        
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
    
    public int removeFirst(){return 0;}
    public int removeLast(){return 0;}
    public synchronized void removeMatched(DllNode node){}
    public String toString(){
        
        String result = "[";
        DllNode node = head.getNext();
        
        for(int i = 0 ; i < length ; i++){
            result += node.getData();
           if( i != (length - 1)){
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
        System.out.println("list Length " + dll.getLength());
    
        dll.insertAtHead(15);
        System.out.println(dll.toString());
        System.out.println("list Length " + dll.getLength());
        
        dll.insertAtTail(25);
        System.out.println(dll.toString());
        
        dll.insertAt(35,1);
        System.out.println(dll.toString());
        
        
        dll.insertAt(45,dll.getLength());
        System.out.println(dll.toString());
        
        
        
        dll.insertAt(65,dll.getLength() - 1);
        System.out.println(dll.toString());
    }
        
}
