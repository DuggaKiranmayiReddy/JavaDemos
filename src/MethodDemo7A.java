
public class MethodDemo7A{

	public static void main(String[] args) 
	{
		System.out.println("Main of MetodDemo2");
		
		MethodDemo7A k1 = new MethodDemo7A();
		
		k1.chaitu();
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
