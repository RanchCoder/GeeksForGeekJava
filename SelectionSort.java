import java.util.*;
import java.io.*;

public class SelectionSort {

    
    public void Select(int[] arr,int n){
        int swaps = 0; 
        int tmp;
        for(int i = 0; i< arr.length-1; i++) {
            while(arr[i]!=i+1) {
                tmp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = tmp;
                swaps++;
            }
        }
         
               
           
        System.out.println(swaps);
         
      }
        public static void main(String[] args){
            
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
          
             for(int i = 0 ; i < n ; i++){
              
                 a[i] = sc.nextInt();
              
                 
             }
             
          SelectionSort sct  = new SelectionSort();  
            sct.Select(a,n);
            
             
        
    
}
}