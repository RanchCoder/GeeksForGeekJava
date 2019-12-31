import java.util.*;
class StringPallindrome 
{
	public static void main(String[] args) 
	{
		String str = "abaaa";
        str = str.toLowerCase();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		if(str.equals(sb.toString())){
			System.out.println("Pallindrome");
		}else{
			System.out.println("Not a pallindrome");
		}
		
	}
}
