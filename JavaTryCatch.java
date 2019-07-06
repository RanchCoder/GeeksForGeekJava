import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.*;
import java.util.*;

class stringException extends Exception{
 
    stringException(String str){}
}
class zeroException extends Exception{

    zeroException(String str){}
    
}

public class JavaTryCatch  {

    public static void main(String[] args) throws IOException,Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
     Scanner sc = new Scanner(System.in);
        
    // while(sc.hasNext()){
     
      try{
          
          int x = sc.nextInt();
          int y = sc.nextInt();
          //to check if number is 0 hence division by zero exception must be raised.
          if(y == 0){
           
              throw new Exception("/ by zero");
          
          }
          else{
          //else we print the division result
              int result = x/y;
              System.out.println(result);
              
          }
      
      }
      catch(Exception e){
      
          System.out.println(e);
      }
          
          
     
     
        
    }
}