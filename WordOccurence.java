class WordOccurence 
{
	public static void main(String[] args) 
	{
          
		  String str = "Vishal is doing msc in computer science , Vishal feels to do job while completing his two years of msc";
		  String word = "Vishal";

		  System.out.println(" the word :: " + word + " has occurred :: "+occurenceOfWord(str , word) + " times");
		
	}

	public static int occurenceOfWord(String str,String word){
		String[] arr = str.split(" ");
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++){
	       
				if(word.equals(arr[i])){
					count += 1;
				}

		}
       
	   return count;
	}

	
}
