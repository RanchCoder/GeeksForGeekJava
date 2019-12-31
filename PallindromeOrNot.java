class PallindromeOrNot 
{
	public static void main(String[] args) 
	{
		int number  = 1211;
		int rem = 0, rev = 0;
        int temp = number;
		while(number > 0){
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}

		if(rev == temp){
			System.out.println("Pallindrome");

		}else{
			System.out.println("Not a pallindrome");
		}
	}
}
