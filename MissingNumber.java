class MissingNumber 
{
	public static void main(String[] args) 
	{
		int[] array =new int[100];
		int sum = 0;
		for(int i = 0 ; i < array.length ; i++){
			sum = sum + i + 1;
			array[i] = i + 1;
			if(i == 35){
				array[i - 1] = 0;
			}
		}
        int sumArray = 0;
		for(int i : array){
			sumArray += i;
			System.out.println(i);
		}
        System.out.println("Missing number is :: " + ( sum - sumArray));
	}
}
