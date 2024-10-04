
public class MethodDemo3 
{
	static void funA()
	{
		System.out.println("A");	
		}

	static void funB()
	{
		funA(); 
		System.out.println("B");
		funA();
		}


	public static void main(String[] args) 
	{
		System.out.println("Main");
		funB();
		System.out.println("Done");
	}
	
}
