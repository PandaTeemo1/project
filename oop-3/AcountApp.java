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
import java.util.Scanner;

public class AcountApp{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		Acount a = new Acount();
		
		for(;;){
			System.out.println("1:등록   2:조회   3:비밀번호변경	4:입금	5:출금	6:종료");
			System.out.print("메뉴 번호를 입력하세요 : ");
			int menunum = s.nextInt();
			if(menunum == 1){
				System.out.print("이름 : ");
				String name = s.next();
				System.out.print("계좌번호 : ");
				String acc = s.next();
				System.out.print("비밀번호  : ");
				int password = s.nextInt();
				System.out.print("최초입금액 : ");
				int money = s.nextInt();

				//Contact객체 생성하고, 값을 담기
				
				a.setName(name);
				a.setAcc(acc);
				a.setPassword(password);
				a.setMoney(money);
			} else if(menunum == 2){
				System.out.printf("%s %s %d %d\n", a.getName(), a.getAcc(), a.getPassword(), a.getMoney());
			} else if(menunum == 3){
				System.out.print("비밀번호를 변경하기위해 현재 비밀번호를 눌러주세요 : ");
				int nowPassword = s.nextInt();
				if(a.getPassword() == nowPassword){
					System.out.print("변경될 비밀번호를 눌러주세요 : ");
					int nextPassword1 = s.nextInt();
					System.out.print("비밀번호를 한번더 눌러주세요 : ");
					int nextPassword2 = s.nextInt();
					if(nextPassword1 == nextPassword2){
						System.out.println("비밀번호가 변경되었습니다");
						a.setPassword(nextPassword1);
					} else{
						System.out.println("비밀번호가 틀립니다 다시 변경해주십시오.");
					}

				}
			} else if(menunum == 4){
				System.out.print("입금할 금액을 넣어주세요 : ");
				int pay = s.nextInt();
				a.setMoney(a.getMoney()+pay);
				System.out.println(pay+"원 입금되셨습니다 잔액 : "+a.getMoney()+"원 입니다");
			} else if(menunum == 5){
				System.out.print("비밀번호를 입력하시오 : ");
				int password1 = s.nextInt();
				if(password1 == a.getPassword()){
					System.out.print("출금할 금액을 선택하세요 : ");
					int pay2 = s.nextInt();
					a.setMoney(a.getMoney()-pay2);
					System.out.println(pay2+"원 출금되셨습니다 잔액 : "+a.getMoney()+"원 입니다");
				}

			
			} else if(menunum == 6){
				System.out.println("종료합니다");
				break;
			}
	}
}
}