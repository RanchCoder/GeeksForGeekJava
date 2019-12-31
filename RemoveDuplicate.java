import java.util.Hashtable;
import java.util.Map.Entry;
class RemoveDuplicate 
{

	public static void removeDuplicate(String str){

		str = str.toLowerCase();

        str = str.replaceAll("\\s","");

		char[] array = str.toCharArray();
		System.out.println(String.valueOf(array));
		Hashtable<Character,Integer> hst = new Hashtable<Character,Integer>();
        char[] arr = new char[array.length];
		int j  = 0;
		for(int i = 0 ; i < array.length ; i++){

			if(hst.isEmpty()){
				hst.put(array[i],1);
				arr[j] = array[i];
				j++;
			}else if(hst.containsKey(array[i])){
				System.out.println("Yes " + array[i]);
				hst.put(array[i],hst.get(array[i]) + 1);
			}else{

				hst.put(array[i] , 1);
				arr[j] = array[i];
				j++;
		  
			}
			
		}

		System.out.println(String.valueOf(arr));



		

		
      
		
	}
	public static void main(String[] args) 
	{
		String str = "vishal Singh";
		removeDuplicate(str);
	}
}
