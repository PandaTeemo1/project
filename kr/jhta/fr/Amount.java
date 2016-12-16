package kr.jhta.fr;

public class Amount {
	private String name;
	private String acc;
	private String pwd;
	private int balance;
	
	public Amount(){}

	public Amount(String name, String acc, String pwd, int balance) {
		super();
		this.name = name;
		this.acc = acc;
		this.pwd = pwd;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
