class LargestAndSmallest 
{
	public static void main(String[] args) 
	{
		int[] arr = {55,234,62,123,552,11,243,56,664,23,1};

		int largest = Integer.MIN_VALUE; 
		int smallest = Integer.MAX_VALUE;
		
		for(int i = 0  ; i < arr.length ; i++){
			if(arr[i] < smallest){
				smallest = arr[i];
			}
			if(arr[i] > largest){
				largest = arr[i];
			}
		}

		System.out.println("Smallest :: " + smallest + " largest :: " + largest);
	}
}
