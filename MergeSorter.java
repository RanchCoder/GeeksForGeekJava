public class MergeSorter{
    
    public static void merge(int[] arr,int low, int mid, int high){
        
        int n1 = mid - low + 1; //size of left sub array 
        int n2 = high - mid; // size of right sub array
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for(int i = 0 ; i < n1; i++){
            left[i] = arr[i+low]; // i = 0 , and low will be the current left most element of the sub array , 
                                 //therefore we proceed from that point one by one to store in our new left array
        }
        
        for(int j = 0 ; j < n2 ; j++){
            right[j] = arr[mid+1 + j];  // j = 0 , and mid+1  will be the current  element after mid of the sub array , 
                                       //therefore we proceed from that point one by one to store in our new right array
        
        }
        
        int[] result = new int[n1+n2];
        int i = 0 , j = 0 , k = low; // setting the starting index (low) from where we want to start swap elements in our old array according to a particular order.
        
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i++];
            }else{
                arr[k] = right[j++];
            }
            k++;
        }
        
        while(i < n1){
            arr[k++]  = left[i++];
        }
        while(j < n2){
            arr[k++] = right[j++];
        }
        
        
        
        
    }
    
    
    public static void mergeSort(int[] arr, int low, int high){
        if(low < high){
            int mid  = (high + low) / 2; 
            mergeSort(arr,low,mid); //dividing left till 1 element left
            mergeSort(arr,mid+1,high); //dividing right till 1 element left and recursively go upward
            merge(arr,low,mid,high); // merge the two list.
        }
    }
    
    public static void main(String[] args){
        int[] arr = {25,12,1,32,2,3,6,64,12,134,122};
        mergeSort(arr,0,arr.length - 1);
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
    
    
}
