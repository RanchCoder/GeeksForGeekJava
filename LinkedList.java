class ListNode{
    
    private int data;
    private ListNode next;
    
    public ListNode(int data){
        this.data = data;
    }
    
    public void setData(int data){
     this.data = data;   
    }
    
    public int getData(){
        return data;
    }
    public void setNext(ListNode next){
        
        this.next = next;
        
    }
    
    public ListNode getNext(){
        return this.next;
    }
    
}

public class LinkedList{
    
    public LinkedList(){
        length = 0;
    }
    
    ListNode head;
    
    //return head
    public synchronized ListNode getHead(){
        
        return head;
        
    }
    
    //insert at the beginning position
    public synchronized void insertAtBegin(ListNode node){
        //if head is null, we have no list
        node.next = head;
        head = node;
        length++;
        
    }
    
    //insert at the last position
    public synchronized void insertAtEnd(ListNode node){
        
        if(head == null){
            head = node;
        }else{
            ListNode p , q;
            for(p = head ; (q = p.getNext()) != null ; p = q);
            p.setNext(node);
            
        }
        length++;
        
    }
    
    
    
    //insert at random position
    public synchronized void insert(int data , int position){
      
        //to validate if position is valid or not
        if(position < 0){
            position = 0;
        }
        if(position > length){
            position = length;
        }
        
        if(head == null){
            head = new ListNode(data);
            
        } 
        
    
        
        ListNode temp = head;
        
        
        for(int i = 0 ; i < position ; i++){
            
            temp = temp.getNext();
            
        }
        
        ListNode node = new ListNode(data);
        node.next = temp.next;
        temp.setNext(node);
        
    }
    
    //remove the first node in list
    public synchronized ListNode removeFromBegin(){
        
    }
    
    //remove the last node in list
    public synchronized ListNode removeFromLast(){
        
    }
        // remove the matching node
    public synchronized ListNode removeMatched(ListNode node){
        
    }
    
    // remove at any position
    public void remove(int position){
        
    }
    
    
    
    
    
}


