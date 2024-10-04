
public class ParameterMethodDemo2 {

	public static void main(String[] args) {
		ParameterMethodDemo2 k1 = new ParameterMethodDemo2();
		k1.fun1();
		k1.funA(10,10);
		k1.funB(30, false);
		k1.funC(20.4f,true);
		k1.funD(20.5, 10.3f);
		k1.funE(20.0,'K');
	}
	
	void fun1()
	{
		System.out.println("fun1");
	}
	
	void funA(int a, int b)
	{
		System.out.println("funA");
		System.out.println(a);
		System.out.println(b);
		
	}
	void funB(int a,boolean b)
	{
		System.out.println("funB");
		System.out.println(a);
		System.out.println(b);
		
	}
	void funC(float a, boolean b)
	{
		System.out.println("funC");
		System.out.println(a);
		System.out.println(b);
		
	}
	
	void funD(double a, float b)
	{
		System.out.println("funD");
		System.out.println(a);
		System.out.println(b);
		
	}
	
	void funE(double a, char b)
	{
		System.out.println("funE");
		System.out.println(b);
		System.out.println(a);
		
	}
	
}
