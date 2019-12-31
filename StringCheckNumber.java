class StringCheckNumber 
{
	public static void main(String[] args) 
	{
		String str = "11";
		if(str.matches("[0-9]+") && str.length() >= 2){
			System.out.println("String contains only digits");
		}else{
			System.out.println("String contains mix characters");
		}
		System.out.println("Hello World!");
	}
}
