import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        ArrayList<Integer> list = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            
            list.add(sc.nextInt());
            
        }
        int query = sc.nextInt();
        while(query != 0){
            
            String q = sc.next();
        
        if(q.equals("Insert")){
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            list.add(x,y);
            
        }
        if(q.equals("Delete")) {
            
             int y = sc.nextInt();
             list.remove(y);
            
            
        }

        query = query - 1;            
        }
                
        for(int a : list){
         
            System.out.print(a + " ");
        }
    }
}