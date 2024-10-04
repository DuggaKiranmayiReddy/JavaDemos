public class exam3
{
	
	public static void main(String[]args)
	{
		exam3 k= new exam3();
		k.gretest(80,50,60);
	}
	
	void gretest(int a, int b, int c)
	{
		if (a>b)
		{
				System.out.println("a");
		}
		else if(b>c)
		{
			System.out.println("b");
		}
		else if(c>a)
		{
			System.out.println("c");
		}
		else
		{
			System.out.println("exit");
		}
		
	}
}