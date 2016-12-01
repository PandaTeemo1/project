public class Account{
	//속성을 은닉화
	private String owner;
	private String accountNumber;
	private int password;
	private int balance;
	
	//생성자에 은닉을시키면 뉴자체를 못함.
	public Account(String owner, String accountNumber, int password, int balance){
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.password = password;
		this.balance = balance;

	}
	public String getOwner(){
		return owner;
	}
	public String getaccountNumber(){
		return accountNumber;
	}
	//기능은 공개
	public void info(){
	
		System.out.printf("%s %s %d %d\n", owner, accountNumber, password, balance);
	}
}