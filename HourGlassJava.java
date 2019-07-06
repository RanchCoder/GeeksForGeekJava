import java.io.*;
import java.util.*;

public class HourGlassJava{
    
    
    public static void main(String[] args){
        
        int[][] arr = new int[6][6];
        int temp = 0;
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0 ; i < 6 ; i++){
            
            for(int j = 0 ; j < 6 ; j++){
                
                arr[i][j] = sc.nextInt();
                
            }
            
        }
        
        for(int i = 0 ; i < 4 ; i++){
            
            for(int j = 0 ; j < 4 ; j++){
                
                temp = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        +arr[i+1][j+1]
                        +arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                
                if (max < temp){
                    
                    max = temp;
                    
                }
                
            }
            
        }
        System.out.println(max);
    }
    
}