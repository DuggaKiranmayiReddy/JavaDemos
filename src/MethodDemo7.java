
public class MethodDemo7{

	public static void main(String[] args) 
	{
		System.out.println("Main of MetodDemo2");
		
		MethodDemo7 k1 = new MethodDemo7();
		
		k1.chaitu();
		System.out.println("Done");
		}
	
	void kiran(){
		System.out.println("kiran of MetodDemo2");
		
	}
	void chaitu(){
		System.out.println("chaitu of MetodDemo2");
 
		MethodDemo7 k1 = new MethodDemo7();
		
		k1.kiran();
		
	
	}
	
}
