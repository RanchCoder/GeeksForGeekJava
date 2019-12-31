import java.util.Arrays;
class SortArray 
{
	public static void main(String[] args) 
	{
		String str = "this will be sorted";
		str = str.replaceAll("\\s","");

		System.out.println(str);

		char[] store = str.toCharArray();
        Arrays.sort(store);
		System.out.println(String.valueOf(store));

	}
}
