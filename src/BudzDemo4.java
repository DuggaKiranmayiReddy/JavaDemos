
public class BudzDemo4 {

	public static void main(String[] args) {
		int grossSalary = 100000;
		BudzDemo4 bd1 = new BudzDemo4();
		
		int charges = bd1.houseCharges();
		
		int netSalary = grossSalary -charges;
		System.out.println(netSalary);
		
		int taxCal = 30* charges;
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
