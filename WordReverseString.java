class WordReverseString 
{
	public static void reverseWord(String str){
		
		String[] sArray = str.split("\\s");
		String reverseString = "";

		for(String s : sArray)
		{
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			reverseString += sb.toString() + " ";
		}
		
		System.out.println(reverseString);
		
	}
	public static void main(String[] args) 
	{
		String str = "This is my name";
		reverseWord(str);
	}
}
