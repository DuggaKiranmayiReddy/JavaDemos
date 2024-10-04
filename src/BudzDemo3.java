
public class BudzDemo3 {

	public static void main(String[] args) {
		int grossSalary = 100000;
		BudzDemo3 bd1 = new BudzDemo3();
		
		int netSalary = grossSalary - bd1.houseCharges();
		System.out.println(netSalary);
		
		int taxCal = 30* bd1.houseCharges();
		System.out.println(taxCal);
		
	}
	int houseCharges()
	{
		System.out.println("house og budz");
		int rent = 20000;
		int childfee = 10000;
		int totalCharges = rent + childfee;
		System.out.println(totalCharges);
		return totalCharges;
	}

}
