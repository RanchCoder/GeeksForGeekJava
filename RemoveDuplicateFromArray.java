import java.util.Arrays;
class RemoveDuplicateFromArray 
{
	public static int removeDuplicateFromArray(int[] arr,int length){

		if(length == 0 || length == 1){
			
			return length;

		}
        int j = 0;
		int temp[] = new int[length];
		for(int i = 0 ; i < length - 1; i++){
			 
			 if(arr[i] != arr[i+1]){
				temp[j++] = arr[i];
			 }


		}

		temp[j++] = arr[length - 1];

		for(int i = 0 ; i < j ; i++){
			arr[i] = temp[i];
		}

		return j;
		
	}
	public static void main(String[] args) 
	{
		int[] arr  = {1,2,3,4,5,6,5,6};
		Arrays.sort(arr);
		int len = arr.length;

		int length = removeDuplicateFromArray(arr,len);

		for(int i  = 0 ; i < length ; i++){
			System.out.print(arr[i]);
		}
	}
}
