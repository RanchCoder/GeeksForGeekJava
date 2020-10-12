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
    
    public ListNode getNext(){
        return this.next;
    }
    
    public void setNext(ListNode next){
        this.next = next;
    }
    
    
}


public class LinkedList{
    public int length;
    
    public LinkedList(){
        length = 0;
    }
    
    ListNode head;
    public ListNode getHead(){
        return head;
    }
    
    public synchronized void insertAtBeginning(ListNode node){
       
        if(head == null){
            head = node;
       }
       else{
       node.setNext(head);
       head = node;
       }
       length += 1;
    
    }
    
    public synchronized void insertAtEnd(ListNode node){
        if(head == null){
            
            head = node;
        }
        else{
            ListNode p , q ;
            for(p = head ; (q = p.getNext()) != null ; p = q);
            p.setNext(node);
            
        }
        length += 1;
    }
    
    public synchronized void insert(int data){
        ListNode node = new ListNode(data);
        if(head == null){
            head = node;
           
        }
        else{
            ListNode p , q ;
            for(p = head ; (q = p.getNext()) != null ; p = q);
            p.setNext(node);
            
        }
        length += 1;
        
        
    }
    
    public synchronized void insertAtPosition(int data, int position){
        
        if(position < 0){
            position = 0;
        }
        if(position > length){
            position = length;
        }
        ListNode node = new ListNode(data);
        if(position == 0){
            
            insertAtBeginning(node);
            
        }else{
            ListNode p = head;
            for(int i = 1 ; i < position ; i++){
                p = p.getNext();
                
            }
            node.setNext(p.getNext());
            p.setNext(node);
            
        }
        
        length += 1;
        
    }
    
    public synchronized ListNode removeFromFirst(){
        
        if(head == null) {
            return null;
        }
        
        ListNode p = head;
        head = p.getNext();
        length -= 1;
        return p;
    }
    
    public synchronized ListNode removeFromLast(){
        
        if(head == null){
            return null;
        }
        ListNode p = head , q = null , next = head.getNext();
        if(next == null){
            head = null;
            length -= 1;
            return p;
            
        }
        while((next = p.getNext()) != null){
            q = p;
            p = next;
            
        }
        
        q.setNext(null);
        length -= 1;
        return p;
        
        
    }
    
    public synchronized ListNode removeAtPosition(int position){
        
        if(position < 0){
            position = 0;
        }
        if(position > length){
            
            position = length - 1;
            
        }
        ListNode p = head;
        if(position == 0){
            head = p.getNext();
            length -=  1;
            return p;
        }
        else{
            
            for(int i = 1 ; i < position ; i++){
                
                p = p.getNext();
            }
            ListNode q = p.getNext();
            p.setNext(p.getNext().getNext());
            length -= 1;
            return q;
        }
        
    }
    
    public synchronized void removeNode(ListNode node){
        
        if(head == null){
            return;
        }
        ListNode p = head , q = null;
        
        
        if(node.equals(head)){
          head = head.getNext();
          length -= 1;
          return;
        }
        
        while((q = p.getNext()) != null){
            if(node.equals(q)){
                p.setNext(q.getNext());
                length -= 1;
                return;
            }
            p = q;
        }
    }
    
  
    
    public String toString(){
        String result = "[";
        ListNode p = head, q = null;
        result += p.getData();
        while((q = p.getNext()) != null){
            
            if(p.getNext() != null){
                result += " , ";
            }
            result += q.getData();
            p = q;
        }
        result += "]";
        return result;
    }
    
    public static void main(String[] args){
        
        ListNode node = new ListNode(10);
        LinkedList ls = new LinkedList();
        ls.insertAtBeginning(node);
        System.out.println(ls.toString());
        ls.insert(20);
        
        System.out.println(ls.toString());
        
        ls.insert(30);
        
        System.out.println(ls.toString());
        
        ls.insert(40);
        
        System.out.println(ls.toString());
        
        ls.insertAtBeginning(new ListNode(100));
        
        System.out.println(ls.toString());
        
        ls.insertAtEnd(new ListNode(200));
        
        System.out.println(ls.toString());
        
        ls.removeFromFirst();
        
        System.out.println(ls.toString());
        
        ls.removeFromLast();
        
        System.out.println(ls.toString());
        
        ls.removeAtPosition(2);
        
        System.out.println(ls.toString());
        
        ls.insertAtPosition(240,2);
        
        System.out.println(ls.toString());
        
        ls.removeNode(new ListNode(240));
        
        System.out.println(ls.toString());
        
        
    }
}

