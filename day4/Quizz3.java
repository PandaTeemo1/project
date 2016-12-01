import java.util.Random;
import java.util.Scanner;

public class Quizz3{
	public static void main(String[] args){
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int island = 0; // 0이면 자유 1이면 무인도
		int count = 3;
		int total = 0;
		for(;;){
			System.out.println("----------------------------------");
			System.out.println("[1]주사위 굴리기	[0]종료");
			System.out.println("----------------------------------");
			System.out.print("메뉴를 선택하세요 : ");
			int no = sc.nextInt();

			
			if(no == 1){
				int dice1 = ran.nextInt(6)+1;
				int dice2 = ran.nextInt(6)+1;

				if((dice1 + dice2) == 7){
					System.out.println("무인도로 떠납니다");
					island = 1;

				} else {
					System.out.println(dice2 + dice1 +"칸수만큼 앞으로갑니다");
					total = total + dice1 + dice2;
					System.out.println(total+"칸수만큼 앞으로 가셨습니다");
				}
			}
		}
	}
}