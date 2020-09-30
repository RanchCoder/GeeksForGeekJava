public class DynamicQueue {
    
    private int rear , front , size;
    private static int CAPACITY = 16;
    private int[] queueRep;
    
    //empty constructor intialization process
    public DynamicQueue(){
        
        rear = 0 ; front = 0 ; size = 0;
        queueRep = new int[CAPACITY];
        
        
    }
    
    //parameterize constructor
    public DynamicQueue(int cap) throws NullPointerException{
        if(cap <= 0){
             throw new NullPointerException("please give a valid capacity for a queue");
        }
        CAPACITY = cap;
        queueRep = new int[cap];
        
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        
        return (size == 0);
        
    }
    
    public int front(){
        
        return queueRep[front];
        
    }
    
    
    public void enqueue(int data)throws NullPointerException , IllegalStateException{
        
        if(size == CAPACITY){
            
       // System.out.println("Size and capacity are equal");
            expand();
        }
       // System.out.println("Size and capacity not equal" + rear);
        size++;
        queueRep[rear] = data;
        rear = (rear + 1) % CAPACITY;
        
        
    }
    
    
    public int dequeue(){
        
        int data = queueRep[front];
        size--;
        queueRep[front] = Integer.MIN_VALUE;
        front = (front+1)% CAPACITY;
        return data;
    }
    
    public void expand(){
        
        int length = size;
        int newQueue[] = new int[length<<1];
        
            System.out.println("rear at : " + rear + " front at : " + front);   
        // if front and  rear pointer are pointing at the exact same location
        if(rear == 0){ 
            for(int i = 0 ; i < queueRep.length ; i++){
                newQueue[i] = queueRep[i];
            }
            
            
            
        }
        else{
            
            int j = 0, temp = front;
            //System.out.println("temp value : " + temp + " and rear " + rear);
                
            //we go only till one element before rear pointer , because there might be a issue of rear and front both pointer pointing at same location other than 0
            while(temp != rear - 1){
                newQueue[j] = queueRep[temp%CAPACITY];
                j++;
                temp = (temp+1) % CAPACITY;
                
            }
            
            newQueue[j] = queueRep[temp];
            
        }
        
        
        //resetting rear , size , capacity , queueRep and front
        queueRep = newQueue;
        front = 0;
        rear = size;
        CAPACITY *= 2;
        
    }
    
    
    public String toString(){
        
        String result = "[";
        
        for(int i = 0 ; i < size ; i++){
            
            result += Integer.toString(queueRep[(front + i) %CAPACITY]); 
            if(i < size - 1) result += ", ";
        }
        result += "]";
        return result;
    }
    
    
    
    
    public static void main(String args[]) {
      
      DynamicQueue dq = new DynamicQueue(5);
      
      dq.enqueue(1);System.out.println(dq.toString());
      dq.enqueue(2);System.out.println(dq.toString());
      dq.enqueue(3);System.out.println(dq.toString());
      dq.enqueue(4);System.out.println(dq.toString());
      dq.enqueue(5);System.out.println(dq.toString());
      System.out.println("removed element : "+dq.dequeue());
      
      System.out.println(dq.toString());
      dq.enqueue(6);System.out.println(dq.toString());
      dq.enqueue(7);System.out.println(dq.toString());
      dq.enqueue(8);System.out.println(dq.toString());
      dq.enqueue(9);System.out.println(dq.toString());
      dq.enqueue(10);
      System.out.println(dq.toString());
      dq.enqueue(11);
      
      System.out.println("removed element : "+dq.dequeue());
      
      System.out.println(dq.toString());
       System.out.println("removed element : "+dq.dequeue());
       
      System.out.println(dq.toString());
        System.out.println("removed element : "+dq.dequeue());
        
      System.out.println(dq.toString());
         System.out.println("removed element : "+dq.dequeue());
         
      System.out.println(dq.toString());
      

    }
}
