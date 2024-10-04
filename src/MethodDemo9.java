
public class MethodDemo9 {

	public static void main(String[] args) {
		MethodDemo9 k1 = new MethodDemo9();
		k1.funA();
		k1.funB();
		System.out.println("Demo9");
	}
	
	void funA()
	{
		int a = 10;
		int b = 20;
		int c= a+b;
		System.out.println(c);
		
	}
	int funB()
	{
		int a = 10;
		int b = 20;
		int c= a+b;
		System.out.println(c);
		return 3000;
		
	}
}
