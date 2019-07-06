/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class RotateAndDelete {
	public static void main (String[] args) throws IOException {
		//code
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
		    int i , j;
		    
		    int N = Integer.parseInt(br.readLine().trim());
		    //ArrayList<Integer> arr = new ArrayList<Integer>();
		    int[] arr = new int[N];
                    for(i = 0 ; i < N ; i++){
		        
		        arr[i] = Integer.parseInt(br.readLine().trim());
		        
		    }
		    
		    int d = Integer.parseInt(br.readLine().trim());
		    
		    Collections.rotate(Arrays.asList(arr),d);
		    
		                  System.out.println(Arrays.toString(arr));
		    t--;
		}
		
	}
}