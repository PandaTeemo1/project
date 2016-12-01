import java.util.Scanner;

public class ForDemo7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int total = 0;
		for(;;){
			
			System.out.println();
			System.out.println("[1]입금	[2]출금	[3]조회	[0]종료");
			System.out.print("메뉴를 선택하세요:");
			int menuNo =sc.nextInt();
		
			if(menuNo == 1){
				System.out.print("예금액 : ");
				int money = sc.nextInt();
				total = total + money;
				System.out.println(total+"원이 입금되었습니다");
			} else if(menuNo==2){
				System.out.print("출금액 : ");
				int money = sc.nextInt();
					if(total >= money){
						total = total - money;
						System.out.println(money+"원이 출금되었습니다");
					}else{
						System.out.println("잔액이 부족합니다");
						break;
					}	
				} else if(menuNo==3){
				System.out.println("잔고 "+total+"원있습니다");
			} else if(menuNo==0){
				System.out.println("종료합니다");
				break;
			}
		}
	}
}