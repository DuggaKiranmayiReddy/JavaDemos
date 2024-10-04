
public class BudzDemo1 {

	public static void main(String[] args) {
		int grossSalary = 100000;
		int netSalary = grossSalary - totalCharges;
		System.out.println(netSalary);
		
	}
	void houseCharges()
	{
		int rent = 20000;
		int childfee = 10000;
		int totalCharges = rent + childfee;
		System.out.println(totalCharges);
	}

}
