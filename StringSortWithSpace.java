class StringSortWithSpace 
{
	public static String StringSortWithSpace(String str){
		
		char[] ch = str.toCharArray();
		System.out.println(String.valueOf(ch));

		char[] tempArray = new char[ch.length];

		for(int i = 0 ; i < ch.length; i++){
			
			if(ch[i] ==' '){
				tempArray[i] =' ';
			}
		}

		int j = tempArray.length - 1;


		for(int i = 0 ; i < ch.length ; i++){

			if(ch[i] !=' '){
				if(tempArray[j] ==' '){
					j--;
				}

				tempArray[j] = ch[i];
				j--;
			}				 


		}
		System.out.println(String.valueOf(tempArray));

		return String.valueOf(tempArray);
	}
	public static void main(String[] args) 
	{
		String str = "This is a String";
		System.out.println(StringSortWithSpace(str));
	}
}
