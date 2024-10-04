
public class Operators 
	{
	
	//Less Than
	void lesserThan(int a, int b)
	{
	if(a<b)
	{
		System.out.println(true);
	}
	else
	{
		System.out.println(false);
	}
	}
	
	//Greater Than
	void greaterThan(int a, int b)
	{
	if(a>b)
	{
		System.out.println(true);
	}
	else
	{
		System.out.println(false);
	}
	}
	
	//Greater Than Or Equal To
	void greaterOrEql(int a,int b)
	{
		if(a>=b)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	
	}
	
	//Less Than Or Equal To
	void lesserOrEql(int a,int b)
	{
		if(a<=b)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	
	}
	
	//Double Equal To
	void equal(int a,int b)
	{
		if(a==b)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	
	}
	
	//Not Equal To
	int notEqual(float a,int b)
	{
		if(a!=b)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	
	}

	public static void main(String[] args) {
		Operators o = new Operators();
		o.lesserThan(40,50);
		o.greaterThan(60,30);
		o.greaterOrEql(80,'b');
		o.lesserOrEql(' ',100);
		o.equal(9766,10);
		o.notEqual(70.98f,566);
		
	}

}
