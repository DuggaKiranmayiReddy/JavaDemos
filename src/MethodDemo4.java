
public class MethodDemo4 {

	public static void main(String[] args) {
		
		System.out.println("Main");
		funC();
		System.out.println("Done");
	}
	
	static void funA()
	{
		System.out.println("funA");	
		funC();
	}
	static void funB()
	{
		System.out.println("funB");	
		funA();
	}
	static void funC()
	{
		System.out.println("funC");	
		funB();
	}

}
