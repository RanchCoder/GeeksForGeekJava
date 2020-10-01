
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
    int length;
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
        node.setNext(head);
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


        for(int i = 1 ; i < position ; i++){

            temp = temp.getNext();

        }

        ListNode node = new ListNode(data);
        node.setNext(temp.getNext());
        temp.setNext(node);

    }

    //remove the first node in list
    public synchronized ListNode removeFromBegin(){
        
        ListNode node = head;
        if(node != null){
            head = node.getNext();
            node.setNext(null);
            length--;
        }
        return node;

    }

    //remove the last node in list
    public synchronized ListNode removeFromLast(){
        
        if(head == null){
            return null;
        }
        ListNode p = head , q = null , next = head.getNext();
        if(next == null){
            head = null;
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
        // remove the matching node
    public synchronized void removeMatched(ListNode node){
        // if head is null, do nothing
        if(head == null){
            return;
        }
        
        //if head is not null, check if head itself the node;
        if(node.equals(head)){
            
            head = head.getNext();
            return;
        }
        //else check if next or any of the node after head is the node
        ListNode p = head , q = null ;
        while((q = p.getNext()) != null){
            if(node.equals(q)){ // we meet the node here
                p.setNext(q.getNext()); // setting its previous node to point to matched node's node
                length -= 1;
                return;
            }
            p = q;  // to move ahead in the list , if the current nod is not the node
        }

    }

    // remove at any position
    public void remove(int position){
        
        if(position < 0){
            position = 0;
        }
        if(position > length){
            position = length - 1;
        }
        
        if(position == 0){
            
            head = head.getNext();
            return;
            
        }
        else{
            ListNode p = head;
            //loop till we reach a position one before the acutal element
            for(int i = 1 ; i < position ; i++){
                p = p.getNext();
                
            }
            p.setNext(p.getNext().getNext());
            
            
        }
        length -= 1;
        

    }
    
    public String toString(){
        String result = "[";
        if(head == null){
            result += "]";
            
        }
        
        ListNode temp = head;
        
        while(temp != null){
            
            
            result +=   temp.getData();
            if(temp.getNext() != null){
                result += " , ";
            }
            temp = temp.getNext();
            
        }
        result += "]";
        return result;
    }


   public static void main(String[] args){
       
       LinkedList ll = new LinkedList();
       ListNode node = new ListNode(10);
       ll.insertAtBegin(node);
       System.out.println(ll.toString());
       ll.insert(20, 1);
       System.out.println(ll.toString());
       
   }



}


