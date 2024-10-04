
public class ParameterMethodDemo1 {

	public static void main(String[] args) {
		ParameterMethodDemo1 k1 = new ParameterMethodDemo1();
		k1.fun1();
		k1.funA(10);
		k1.funB(100l);
		k1.funC(20.4f);
		k1.funD(20.5);
		k1.funE('K');
		k1.funF(true);
	}
	
	void fun1()
	{
		System.out.println("fun1");
	}
	
	void funA(int a)
	{
		System.out.println("funA");
		System.out.println(a);
		
	}
	void funB(long b)
	{
		System.out.println("funB");
		System.out.println(b);
		
	}
	void funC(float c)
	{
		System.out.println("funC");
		System.out.println(c);
		
	}
	
	void funD(double d)
	{
		System.out.println("funD");
		System.out.println(d);
		
	}
	
	void funE(char e)
	{
		System.out.println("funE");
		System.out.println(e);
		
	}
	void funF(boolean f)
	{
		System.out.println("funF");
		System.out.println(f);
		
	}

}
