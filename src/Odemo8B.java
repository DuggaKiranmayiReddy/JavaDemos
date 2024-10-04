 
public class Odemo8B {
	
	void funA(Suresh s1)
	{
		System.out.println(s1);
	}
	void funB(VariableDemo1 v1)
	{
		System.out.println(v1);
	}
	void funC(MethodDemo7 m1)
	{
		System.out.println(m1);
	}
	//void funD(Kiran u1)
	//{
	//	System.out.println(u1);
	//}
	public static void main(String[] args) {

		Odemo8B k = new Odemo8B();
		
		Suresh k1 = new Suresh();
		k.funA(k1);
		k.funA(null);
		
		VariableDemo1 k2 = new VariableDemo1();
		k.funB(k2);
		k.funB(null);
		

		MethodDemo7 k3 = new MethodDemo7();
		k.funC(k3);
		k.funC(null);
		
	}

}
