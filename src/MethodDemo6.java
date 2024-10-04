
public class MethodDemo6 
{
	public static void main(String[] args) 
	{
		System.out.println("Main");
		funB();
		System.out.println("Done");
	}
	void funA()
	{
		System.out.println("A");	
		}

	static void funB()
	{
		System.out.println("B");
		MethodDemo5 k1 = new MethodDemo5();
		k1.funA();
		
		}

}
