
public class BudzDemo4
{
	BudzDemo4 bd1 = new BudzDemo4();
	
	public static void main(String[] args)
	{
		int grosssalary = 100000;
		BudzDemo4 bd2 = new BudzDemo4();
		double savings= grosssalary- bd2.housecharges();
		System.out.println(savings);
		double bonus = 5000;
		double totalincome = savings + bonus;// 
		System.out.println(totalincome);
		System.out.println(bd2.housecharges());
	}
	double housecharges()
	{
		int rent=25000;
		int childfee = 2000;
		double misc = bd1.exp()+ bd1.shopping();
		
		double charges = rent+childfee+misc;
		System.out.println(charges);
		return charges;
	}
	double exp()
	{
		double snacks =2525.2525;
		int dmart = 25000;
		double provisions = dmart+snacks;
		System.out.println(provisions);
		return provisions;
	}
	double shopping()
	{
		int lifestyle=10000;
		float goatballs= 532.5f;
		double favs= lifestyle+goatballs;
		System.out.println(favs);
		return favs;
	}
}