class EasyTutsSolution 
{
	public static void main(String[] args) 
	{
		int count = 5;
		int value = 1;
		for(int row = 1 ; row <= 5 ; row++){
			for(int space = 1; space <= count ; space++){
				System.out.print(" ");
			}
			count--;
			for(int col = 1 ; col <= row ; col++){
				System.out.print(value+"  ");
				value++;
			}

			
			System.out.println();

		}
	}
}
