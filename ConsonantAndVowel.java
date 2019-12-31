class ConsonantAndVowel 

{
	public static void counterMethod(String str){
		int v_counter = 0, c_counter = 0;
		char[] chr = str.toCharArray();
		for(int i = 0 ; i < chr.length ; i++){
			
			if(chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' ||  chr[i] == 'o' || chr[i] == 'u'){
				v_counter += 1;
			}else if(chr[i] >= 'a' && chr[i] <= 'z'){
				c_counter += 1; 
			}
		}

		System.out.println("Vowel count is :: " + v_counter + " consonant count is ::  " + c_counter);
	}
	public static void main(String[] args) 
	{
		String str = "This is a string";

		str = str.toLowerCase();
		counterMethod(str);


	}
}
