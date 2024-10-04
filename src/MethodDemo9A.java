
public class MethodDemo9A {

	public static void main(String[] args) {
	funA();
	funB();
		System.out.println("Demo9");
	}
	
	static void funA()
	{
		int a = 10;
		int b = 20;
		int c= a+b;
		System.out.println(c);
		
	}
	static int funB()
	{
		int a = 10;
		int b = 20;
		int c= a+b;
		System.out.println(c);
		return 3000;
		
	}
}
