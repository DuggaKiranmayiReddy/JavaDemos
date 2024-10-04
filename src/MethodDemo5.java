
public class MethodDemo5 
{
	public static void main(String[] args) 
	{
		System.out.println("Main");
		MethodDemo5 k1 = new MethodDemo5();
		k1.funB();
		System.out.println("Done");
	}
	static void funA()
	{
		System.out.println("A");	
		}

	void funB()
	{
		System.out.println("B");
		funA();
		}

}
