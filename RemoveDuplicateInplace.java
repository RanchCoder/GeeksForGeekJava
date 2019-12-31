import java.util.Arrays;
class RemoveDuplicateInplace 
{
	public static int inplaceRemoveDuplicate(int[] arr,int n){

		if(n == 0 || n == 1){
			return n;
		}
		int j = 0 ;
		for(int i = 0 ; i < n - 1 ; i++){

			if(arr[i] != arr[i + 1]){
				arr[j++] = arr[i];
			}
			
		}
		arr[j++] = arr[n-1];

		return j;
		
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,1,2,3,4};
        Arrays.sort(arr);
        int n = arr.length;
		int size = inplaceRemoveDuplicate(arr,n);

		for(int i = 0 ; i < size ;i++){
			
			System.out.print(arr[i]);
		}
		
	}
}
