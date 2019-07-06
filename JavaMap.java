//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class JavaMap{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        HashMap<String,Integer> hts = new HashMap<String,Integer>();
        
        int n = sc.nextInt();
        int number; String name;
         for(int i = 0 ; i < n ; i++){
                                   
              name = "";
              sc.nextLine();
              name = sc.nextLine();
              
              number = sc.nextInt(); 
              hts.put(name , number);
              
             
             
             
                 }
        
        while(n > 0){
            
             sc.nextLine();
              String query = sc.nextLine();
              
                  if(hts.containsKey(query)){
                  for(Map.Entry mts : hts.entrySet()){
                      
                      
                      
                       System.out.println(mts.getKey() +"="+mts.getValue());
                      break;
                  }
                  }   
                   else{
                 
                 System.out.println("Not found");
                 
             }   
                  
              
             
            
            n = n - 1;
        }
        //int query = sc.nextInt();
        
        
        
}
}


