class CllNode{
    private int data;
    private CllNode next;
    
    public CllNode(int data){
        this.data = data;
        next = null;
    }
    
    public int getData(){
        return data;
    }
    
    public void setData(int data){
        this.data = data;
    }
    
    public CllNode getNext(){
        return next;
    }
    
    public void setNext(CllNode node){
        this.next = node;
    }
    
}

public class CircularLinkedList{
    
    protected CllNode tail;
    protected int length;
    public CircularLinkedList(){
        tail = null;
        length = 0;
    }
    
    //add element to the head of the circular list
    public void addToHead(int data){
        
        CllNode temp = new CllNode(data);
        if(tail == null){
            tail = temp;
            tail.setNext(tail);
        }else{
            temp.setNext(tail.getNext());
            tail.setNext(temp);
            
        }
        length++;
    }
    
    //add element to the tail of the list
    public void addToTail(int data){
        
        addToHead(data);
        tail = tail.getNext();
        
    }
    
    //add element
    public void add(int data){
        addToHead(data);
    }
    
    //peek element at the tail
    public int peek(){
        return tail.getData();
    }
    
    //remove the element from the head
    public int removeFromHead(){
        
        CllNode temp = tail.getNext();
        if(tail == tail.getNext()){
            tail = null;
        }else{
          tail.setNext(temp.getNext());
          temp.setNext(null);
        }
        length--;
        return temp.getData();
        
        
    }
    
    //remove the element from the tail
    public int removeFromTail(){
        
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        CllNode temp = tail.getNext();
        
        while(temp.getNext() != tail){
            temp = temp.getNext();
        }
        
        CllNode tailNode = tail;
        if(temp == tail){
            tail = null;
        }else{
          temp.setNext(tailNode.getNext());
         
          tail = temp;
        }
        
        length--;
        return tailNode.getData();
    }
    
    //a boolean to check if list contains the data
    public boolean contains(int data){
        if(tail == null){
            return false;
        }
        CllNode temp = tail.getNext();
        while(temp != tail && (temp.getData() != data)){
            temp = temp.getNext();
        }
        return temp.getData() == data;
        
    }
    
    // to remove the element from the list of specified data
    public int remove(int data){
        
        if(tail == null) return Integer.MIN_VALUE;
        CllNode temp = tail.getNext();
        CllNode previous = tail;
        
        int element;
        for(element = 0 ; element < length && (!(temp.getData() == data)) ; element++){
            previous = previous.getNext();
            temp = temp.getNext();
        }
        
        if(temp.getData() == data){
            
            
        if(tail == tail.getNext()){
            tail = null;
             
        }
        else{
            if(temp == tail){
                tail = previous;
                previous.setNext(previous.getNext().getNext());
            }
            
        }
        temp.setNext(null);
        length--;
        return temp.getData();    
        }
        else return Integer.MAX_VALUE;
        
    }
    public int size(){
        return length;
        
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        
        return tail == null;
    }
    public String toString(){
        if(tail == null){
            return "[]";
        }
        String result = "[";
        CllNode temp = tail.getNext();
        for(int i = 0 ; i < length ; i++){
            result += temp.getData();
            if(i < length - 1 ){
                result += " , ";
            }
            temp = temp.getNext();
        }
        return result;
        
    }
    
    public static void main(String[] args){
        CircularLinkedList cll = new CircularLinkedList();
        cll.addToHead(10);
        cll.addToHead(20);
        System.out.println(cll.toString());
        cll.addToTail(30);
        System.out.println(cll.toString());
        cll.removeFromHead();
        System.out.println(cll.toString());
        cll.removeFromTail();
        System.out.println(cll.toString());
        cll.addToHead(20);
        cll.addToHead(20);
        System.out.println(cll.toString());
        cll.remove(10);
        System.out.println(cll.toString());
         
    }
    
}
