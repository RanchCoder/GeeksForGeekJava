class  RemoveWhiteSpace
{
	public static void main(String[] args) 
	{
		String str = "This is a default text";
		String[] arr = str.split(" ");
		str.trim();
		System.out.println(str);
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < arr.length ; i++){
			sb.append(arr[i]);
		}

		System.out.println(sb.toString());
	}
}
