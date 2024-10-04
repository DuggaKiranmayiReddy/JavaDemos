
public class Odemo8C {
	void fun1(A a1){
		System.out.println(a1);
		if(a1!=null)
		{
			a1.i=a1.i+1;
			a1.j=a1.j+2;
			
		}
		System.out.println("End");
	}
	public static void main(String[] args) {
		Odemo8C d1 = new Odemo8C();
		A k = new A();
		d1.fun1(k);
		
		System.out.println(k.i);
		System.out.println(k.j);

	}

}
