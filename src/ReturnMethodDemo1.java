
public class ReturnMethodDemo1 {

	public static void main(String[] args) {
		ReturnMethodDemo1 k1 = new ReturnMethodDemo1();
		
		int a = k1.fun1();
		System.out.println(a);
		
		System.out.println(k1.fun1());
		
		long b = k1.fun2();
		System.out.println(b);
		
		System.out.println(k1.fun2());
		
		float c = k1.fun3();
		System.out.println(c);
		
		System.out.println(k1.fun3());
		
		double d = k1.fun4();
		System.out.println(d);
		
		System.out.println(k1.fun4());
		
		char e = k1.fun5();
		System.out.println(e);
		
		System.out.println(k1.fun5());
		
		boolean f = k1.fun6();
		System.out.println(f);
		
		System.out.println(k1.fun6());
	}
	
	int fun1(){
		return 10;
	}
	
	long fun2(){
		return 10l;
	}
	float fun3(){
		return 10.9f;
	}
	double fun4(){
		return 10.98;
	}
	char fun5(){
		return 'K';
	}
	boolean fun6(){
		return true;
	}

}
