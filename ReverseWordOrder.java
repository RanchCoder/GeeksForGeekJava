class ReverseWordOrder
{
	public static void reverseWordOrder(String str){

		String[] s = str.split("\\s");
		String reverse = "";
		for(int i = s.length - 1 ; i >= 0 ; i--){
			StringBuilder sb = new StringBuilder(s[i]);
			reverse += sb.toString() + " ";
		}

		System.out.println(reverse);

	}

	public static void main(String[] args){
		 String str = "This is my name";
		 reverseWordOrder(str);
	}
}