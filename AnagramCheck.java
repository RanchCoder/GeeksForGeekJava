import java.util.*;
class AnagramCheck 
{
	public static void main(String[] args) 
	{
		System.out.println(anagram("java","aaaj"));
	}

	public static boolean anagram(String str1, String str2){

		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();

		if(c1.length != c2.length){
			return false;
		}

		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i = 0 ; i < c1.length; i++){
			if(c1[i] != c2[i]){
				return false;
			}
		}

		return true;
		
	}
}
