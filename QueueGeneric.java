public class Queue<T> implements Iterable<T>{
    
    private java.util.LinkedList<T> list = new java.util.LinkedList<T>();
    
    public Queue(){}
    
    public Queue(T data){
        enqueue(data);
    }
    
    public int size(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return size() == 0;
    }
    
    public T peek(){
        if(isEmpty()) throw new RuntimeException('The queue is empty');    
        return list.peekFirst();
    }
    
    public T dequeue(){
        if(isEmpty()) throw new RuntimeException('The queue is empty');    
        return list.removeFirst();
    }
    
    public void enqueue(T data){
        list.addLast(data);
    }
    
    @Override public java.util.Iterator <T> iterator(){
        return list.iterator();
    }
    
    
}
