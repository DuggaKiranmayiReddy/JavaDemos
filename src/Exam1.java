
public class Exam1 {
	int a;

	public static void main(String[] args)
	//Void funA()
	{
		Exam1 t1 = new Exam1();
		t1.a = 10;
		
		Exam1 t2 =new Exam1() ;
		t2.a = t1.a+5;
		
		System.out.println(t2.a);
		
	}
	
	
	
}