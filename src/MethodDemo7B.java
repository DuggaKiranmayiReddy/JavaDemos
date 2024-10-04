
public class MethodDemo7B{

	public static void main(String[] args) 
	{
		System.out.println("Main of MetodDemo2");
		
		MethodDemo7B k1 = new MethodDemo7B();
		
		k1.chaitu();
		MethodDemo7B k2 = new MethodDemo7B();
		
		k2.chaitu();
		System.out.println("Done");
		}
	
	void kiran(){
		System.out.println("kiran of MetodDemo2");
		
	}
	void chaitu(){
		System.out.println("chaitu of MetodDemo2");
		kiran();
		
	
	}
	
}
