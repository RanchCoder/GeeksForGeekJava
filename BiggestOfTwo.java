import java.util.Scanner;
class BiggestOfTwo 
{
	public static void main(String[] args) 
	{
		Scanner s  = new Scanner(System.in);

		System.out.print("Enter number 1 :: ");
		int a = s.nextInt();
		System.out.println();
		System.out.print("Enter number 2 :: ");
		int b = s.nextInt();

		int max = (a > b) ? a : b; 
		System.out.println(max + " is bigger");
		
		
	}
}
