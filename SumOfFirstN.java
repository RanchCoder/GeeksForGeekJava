import java.util.Scanner;
class SumOfFirstN 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the value of n :: ");
		int n = s.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= n ; i++){
			
			sum += i;
		}
        System.out.println();
		System.out.println("Sum of first n number is :: " + sum);
	}
}
