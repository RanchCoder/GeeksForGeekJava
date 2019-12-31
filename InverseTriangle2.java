class InverseTriangle2
{
	public static void main(String[] args) 
	{
		int count = 5;
		for(int row = 1 ; row <= 5 ; row++){
			for(int space = 1 ; space <= row ; space++){
				System.out.print(" ");
			}
            for(int col = count ; col >= 1 ; col--){
				System.out.print("* ");
            }
			count--;
			System.out.println();
		}
	}
}
