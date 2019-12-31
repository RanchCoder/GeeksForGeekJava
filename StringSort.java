import java.util.Arrays;
class StringSort 
{
	public static String Sorter(String str){
        str = str.toLowerCase();
		char[] ch = str.toCharArray();

		Arrays.sort(ch);
		StringBuilder sb = new StringBuilder();
		for(char c : ch){
			sb.append(c);

		}

		return sb.toString();
		
	}
	public static void main(String[] args) 
	{
		String str = "This is a String";

		System.out.println(Sorter(str));
	}
}
