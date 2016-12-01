import java.util.Scanner;

public class Demo8{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("1 : 커피(1500원) 2 : 과일쥬스(2000원) 3 : 이온음료(1000원)");

		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		System.out.print("음료를 고르세요 : ");
		int no = sc.nextInt();

		int returnCoin = 0;

		if(no == 1) {
			System.out.println("커피를 받아가세요");
			returnCoin = money - 1500;
		}
		
		else if(no == 2) {
			System.out.println("과일쥬스를 받아가세요");
			returnCoin = money - 2000;
		}
		
		else if(no == 3) {
			System.out.println("이온음료를 받아가세요");
			returnCoin = money - 1000;
		}
		else {
			System.out.println("잘못된 선택입니다.");
			returnCoin = money;
		}
		System.out.println("거스름돈" + returnCoin);
		int j = returnCoin/10000;
		System.out.println("만원" + j);
		int k = returnCoin/10000/10;
		System.out.println("오천원" + k);
		int l = returnCoin/1000;
		System.out.println("천원" +l);
		int u = returnCoin/500;
		System.out.println("오백원" + u);
		int i = returnCoin/100;
		System.out.println("백원" + i);
		
	}
}