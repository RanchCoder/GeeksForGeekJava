class ReverseString 
{
	public static String reverse(String str){
		
		if(str.length() == 0){
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static String UsingStringBuffer(String str){
		StringBuilder sb = new StringBuilder();
		for(int i = str.length() - 1 ; i >= 0; i--){

			sb.append(str.charAt(i));
			
		}
		return sb.toString();
	}
	public static void main(String[] args) 
	{
		String str = "java";
        String result = reverse(str);
		System.out.println("Reverse of a string is :: " + result);
	    System.out.println("Reverse using StringBuilder" + UsingStringBuffer(str));
	}
}
