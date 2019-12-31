class Test
{
	public void m1(int a){
		System.out.println("integer argument");
	}

    
	public void m1(float a){
		System.out.println("float argument");
	}

	public void m2(String a){
		
		System.out.println("String version");
	}
	public void m2(StringBuffer b){
		System.out.println("String buffer");
	}

	public void m3(int a){
		
	}
	public static void main(String[] args) 
	{

		Test t = new Test();
		t.m1('a');
		

		t.m2("abc");
	}
}
