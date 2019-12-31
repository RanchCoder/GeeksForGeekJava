import java.util.HashMap;
class StringUnique
{
	public static void main(String[] args) 
	{
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		String str = "abc";
		int i;
		for(i = 0 ; i < str.length() ; i++){
			if(hm.isEmpty()){
				hm.put(str.charAt(i),1);
			}else if(hm.containsKey(str.charAt(i))){
				System.out.println("false");
				break;
			}else{
				hm.put(str.charAt(i),1);
			}
			}

		}
        
}

