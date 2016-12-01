/*
	은행계좌를 표현하는 클래스
		-속성
			예금주
			계좌번호
			비밀번호
			금액
		-금액
			출금기능 - 금액과 비밀번호를전달받아서 개설시 입력한 비밀번호가 일치하면 금액만큼 잔액에서 감소시키고 금액만큼의 돈을 반환한다.
			입금기능 - 금액을 전달받아서 그 금액만큼 잔액을 증가시키고 화면에 현재 잔액을 표시한다.
			조회기능 - 예금주, 계좌번호, 잔액을 표시한다.
*/
public class Account{

	String owner;
	String acnum;
	int password;
	int balance;

	public int withdraw2(int amount, int pwd){
		if(password != pwd){
			System.out.println("비밀번호가 일치하지 않습니다.");
			return 0;
		}
		if(balance < amount) {
			System.out.println("금액이 부족합니다.");
			return 0;
		}
		balance -= amount;
		System.out.println("출금 후 잔액 : "+balance);
		return amount;
	}
	//출금기능
	public int withdraw(int amount, int pwd){
		int money = 0;
		if(pwd == password){
			if(balance >= amount ){
				balance-=amount;
				money = amount;
				System.out.println(amount+"원 출금하셨습니다");
				System.out.println("남은잔액은 "+balance+"원 입니다");
			}else{
				System.out.println("잔액이 부족합니다");
			}
		}else{
			System.out.println("비밀번호가 틀리셨습니다");
		}
		return money;
	}
	public void deposit(int amount){
		balance += amount;
		System.out.println(amount+"원 입금되셨습니다");
		System.out.println("남은잔액은 "+balance+"원 입니다");
	}
	public void check(){
		System.out.println("##### 계좌정보 #####");
		System.out.println("예금주 : "+owner);
		System.out.println("계좌번호 : "+acnum);
		System.out.println("잔액 : "+balance);
		System.out.println("####################");
	}
}