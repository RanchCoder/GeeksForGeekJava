import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRSorting {

    public static void sortingArray(int[] arr){
        
        int temp = 0;
        int swap = 0;
        for(int i = 0 ; i <= arr.length - 1 ; i++){
        
            for(int j = 0 ; j < arr.length - 1; j++){
            
                
                temp = arr[j + 1];
                if(arr[j] > arr[j + 1]){
                
                    arr[j + 1] = arr[j];
                    
                    arr[j] = temp;
                    
                    swap = swap + 1;
                
                }
                
                
            
            }
            
        }
        System.out.println("No of swaps in sorting the array is :: "+ swap);
        
        
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        sortingArray(a);
        
    }
}