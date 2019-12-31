class PatternPrime 
{

	public static void PrintPyramid(int size){
		int temp = 2;
		for(int i = 1 ; i <= size ; i++){
			for(int j = 1 ; j <= i ; j++){
				
				while(!isPrime(temp)){
					
					temp++;
				}

				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}
	}
	public static boolean isPrime(int num){
		boolean flag = false;

        for(int k = 2 ;  k <= num / 2 ; k++){
			
			if(num % k == 0){
				
				flag = true;
				break;

			}


        }

		if(flag){
			return false;
		}
		return true;

	}
	public static void main(String[] args) 
	{
		PrintPyramid(5);
		
	}
}
