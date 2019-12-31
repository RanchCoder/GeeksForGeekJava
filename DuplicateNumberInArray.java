import java.util.*;
import java.util.Map.Entry;
import java.util.Hashtable;
class DuplicateNumberInArray 
{
	public static void findDuplicate(int[] arr){
		Hashtable<Integer,Integer> hst = new Hashtable<Integer,Integer>();
		for(int i = 0 ; i < arr.length ; i++){
			if(hst.isEmpty()){
				hst.put(arr[i],1);
			}else if(hst.containsKey(arr[i])){
				hst.put(arr[i],hst.get(arr[i]) + 1);
			}else{
				hst.put(arr[i],1);
			}
		}

		for(Entry<Integer,Integer> entry : hst.entrySet()){
			if(entry.getValue() > 1){
				System.out.println("Duplicate value ::  " + entry.getKey());
			}
		}


	}
	public static void main(String[] args) 
	{
		int[] arr = {10,20,30,2,10,20,11,204,221,12,30};
		findDuplicate(arr);
	}
}
