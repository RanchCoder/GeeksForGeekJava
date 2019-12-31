class InverseArrow 
{
	public static void main(String[] args) 
	{
		int count = 5;
		for(int row = 1 ; row <= 5 ; row++){
			for(int space = count ; space >= 1 ; space--){
				System.out.print(" ");
			}
			count--;
			for(int col = 1 ; col <= row ; col++){
				System.out.print("-");
			}
			System.out.println();
			
			
		}
		int count2 =5;
		for(int row = 1 ; row <= 5 ; row++){
			for(int space = 1 ; space <= row; space++){
				System.out.print(" ");
			}
			for(int col = count2  ; col >= 1 ; col--){
				System.out.print("-");
			}
			count2--;
			System.out.println();
			
			
		}
	}
}
