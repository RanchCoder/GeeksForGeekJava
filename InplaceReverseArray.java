class InplaceReverseArray 
{
	public static void inplaceReverse(int[] arr,int n){

        int temp;
		for(int i = 0 ; i < n / 2 ; i++){
			
			temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
			
		}

		for(int a : arr){
			System.out.print(a + " ");
		}
		
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int length = arr.length;
		inplaceReverse(arr,length);
	}
}
