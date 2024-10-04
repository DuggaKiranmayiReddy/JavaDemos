
public class ReturnMethodDemo2 {

	public static void main(String[] args) {
		System.out.println(fun1());
		System.out.println(fun2());
		System.out.println(fun3());
		System.out.println(fun4());
		System.out.println(fun5());
		System.out.println(fun6());
		

	}
	static int fun1(){
		return 10;
	}
	static long fun2(){
		return 10l;
	}
	static float fun3(){
		return 10.98f;
	}
	static double fun4(){
		return 10.98;
	}
	static char fun5(){
		return 'l';
	}

	static boolean fun6(){
		return false;
	}
}
