import java.util.Scanner;

public class Demo7{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1:커피(1500) 2:과일쥬스(2000) 3:이온음료(1000원)");
		
		int coffee = 1500;
		int juice = 2000;
		int drick = 1000;

		int returnCoin = 0;
		
		System.out.print("금액을 입력하세요 : ");
		int pay = sc.nextInt();
		System.out.print("음료를 고르세요 : ");
		int no = sc.nextInt();

		if(no == 1){
			System.out.println("커피를받으세요");
			//System.out.println("거스름돈 "+(pay-coffee)+"원입니다");
			returnCoin = pay - coffee;
		}
		else if (no == 2){
			System.out.println("과일쥬스를 받으세요");
			//System.out.println("거스름돈 "+(pay-juice)+"원입니다");
			returnCoin = pay - juice;
		}
		else if (no == 3){
			System.out.println("이온음료를 받으세요");
			//System.out.println("거스름돈 "+(pay-drick)+"원입니다");
			returnCoin = pay - drick;
		}
		else {
			System.out.println("선택이 잘못됬습니다.");
			returnCoin = pay;
		}
		System.out.println("거스름돈 "+returnCoin);

		
	}
}