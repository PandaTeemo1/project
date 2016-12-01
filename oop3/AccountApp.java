public class AccountApp{
	public static void main(String[] args){
		Account a = new Account("홍길동", "111-12-1234", 1234, 1000000);

		System.out.println("예금주:" + a.getOwner);// owner에 접근을 할수 없음
		a.info();
	}
}
