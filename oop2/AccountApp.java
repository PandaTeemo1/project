public class AccountApp{
	public static void main(String[] args){
		Account ac1 = new Account();

		ac1.owner = "ȫ�浿";
		ac1.acnum = "123-12-123456";
		ac1.password = 4567;
		ac1.balance = 150000;

		ac1.withdraw(30000, 4567);
		ac1.withdraw(30000, 4568);
		ac1.withdraw(0, 4567);
		ac1.withdraw(30000, 4567);
		ac1.check();
		ac1.deposit(10000);
		ac1.withdraw(30000,4567);
		ac1.withdraw2(30000,4567);
	}
}