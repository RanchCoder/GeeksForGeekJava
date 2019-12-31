class InverseTriangle 
{
	public static void main(String[] args) 
	{
	    int count = 5; 	
		for(int i = 1 ; i <= 5 ; i++){
			for(int space = 1 ; space <= i ; space++){
				System.out.print(" ");
			}
			
			
			for(int j = count ; j >= 1 ; j--){
				System.out.print("*");
			}
			count--;
			
			System.out.println();
		}
	}
}
