
public class Odemo8A {
	
	void funA()
	{
		System.out.println("funA");
	}
	void funB(int a)
	{
		System.out.println("funA");
		System.out.println(a);
	}
	void funC(boolean b)
	{
		System.out.println("funA");
		System.out.println(b);
	}
	void funD(char c)
	{
		System.out.println("funA");
		System.out.println(c);
	}
	void funE(Ramesh r1)
	{
		System.out.println("funA");
		System.out.println(r1);
	}

	public static void main(String[] args) {
		Odemo8A d1 = new Odemo8A();
		d1.funA();
		
		d1.funB(10);
		int a = 40;
		d1.funB(a);
		
		d1.funC(false);
		boolean n = true;
		d1.funC(n);
		
		d1.funD('j');
		char l = 'i';
		d1.funD('u');
		
		Ramesh k = new Ramesh();
		d1.funE(k);
		d1.funE(null);

	}

}
