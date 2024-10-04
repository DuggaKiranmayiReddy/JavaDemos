
public class AllMethodsProgram {

	public static void main(String[] args) {
		
		kiran1(10);
		kiran2(20);
		kiran3();
		kiran4();	
		
		AllMethodsProgram k1 = new AllMethodsProgram();
		k1.chaitu1(70);
		k1.chaitu2(80);
		k1.chaitu3();
		k1.chaitu4();
		
		
	}
	// static - parameter - return
	static int kiran1(int a)
	{
		System.out.println(a);
		return 10;
	}
	 
	// static - parameter - non- return
	static void kiran2(int a)
	{
		System.out.println(a);
		
	}
	// static - zero parameter - return
	static int kiran3()
	{
		int a  =30;
		System.out.println(a);
		return 10;
	}
	
	// static - zero parameter - non- return
	static void kiran4()
	{
		int d =50;
		System.out.println(d);
				
	}
	
	// non static - parameter - return
	int chaitu1(int a)
	{
		System.out.println(a);
		return 10;
	}
	
	//non static - parameter - non- return
	void chaitu2(int a)
	{
		System.out.println(a);
		
	}
	// non static - zero parameter - return
	int chaitu3()
	{
		int a  =30;
		System.out.println(a);
		return 10;
	}
	
	// non static - zero parameter - non- return
	void chaitu4()
	{
		int d =50;
		System.out.println(d);
				
	}



}
