/*banking program
1.계좌등록기능
	이름, 비밀번호, 최초 입금액을 입력받아서 계좌를 생성한다.
	계좌번호는 자동으로 생성되게끔
2.조회기능
	이름, 계좌번호, 잔액을 표시한다.
3. 비밀번호 변경기능
	예전 비밀번호와 새 비밀번호를 입력받아서 비밀번호를 변경한다.
4. 입금 기능
	입금액을 입력받아서 잔액을 증가시킨다.
5. 출금 기능
	출금액과 비밀번호를 입력받아서 잔액을 감소시킨다.
6. 종료
	프로그램을 종료한다.
*/

public class Acount{
	private String name;
	private String acc;
	private int password;
	private int money;

	public Acount(){
	
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAcc(){
		return acc;
	}
	public void setAcc(String acc){
		this.acc = acc;
	}
	public int getPassword(){
		return password;
	}
	public void setPassword(int password){
		this.password = password;
	}
	public int getMoney(){
		return money;
	}
	public void setMoney(int money){
		this.money = money;
	}

}