
import java.util.Hashtable;
import java.util.Map.Entry;
class DuplicateCharacter 
{
	public static void main(String[] args) 
	{

		String str = "This is a string";
		String[] arr = str.split(" ");

		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < arr.length ; i++){
			
			sb.append(arr[i]);
		}

		String send = sb.toString();

		printDuplicate(send);

		
	}

	public static void printDuplicate(String str){
		System.out.println(str);

		str = str.toLowerCase();

		Hashtable<Character,Integer> hm = new Hashtable<Character,Integer>();
	    
        for(int i = 0 ; i < str.length(); i++){
			
			//System.out.println(str.charAt(i));
			if(hm.isEmpty()){
				hm.put(str.charAt(i),1);
			}else if(hm.containsKey(str.charAt(i))){
				hm.put(str.charAt(i),hm.get(str.charAt(i)) + 1);
			}else{
				hm.put(str.charAt(i),1);
			}
        }
		
		for(Entry<Character,Integer> entry : hm.entrySet()){
			if(entry.getValue() > 1){

				System.out.println(entry.getKey() +" :: " + entry.getValue());
	
				
			}
				}
		
	}
}
