import java.util.Scanner;

public class Quizz4{
	public static void main(String[] args){
		//임의의 두자리 숫자를 입력받아서 그 숫자에 해당하는 한글로 변화하기
		//예) 23 -> 이십삼
		Scanner sc = new Scanner(System.in);

		System.out.print("두자리 숫자를 입력하세요 : ");
		int a = sc.nextInt();

		int b = a/10;
		int c = a-(b*10);
		

		if(b == 1){
			System.out.print("십");
		}
		else if(b == 2){
			System.out.print("이십");
		}
		else if(b == 3){
			System.out.print("삼십");
		}
		else if(b == 4){
			System.out.print("사십");
		}
		else if(b == 5){
			System.out.print("오십");
		}		
		else if(b == 6){
			System.out.print("육십");
		}
		else if(b == 7){
			System.out.print("칠십");
		}
		else if(b == 8){
			System.out.print("팔십");
		}
		else if(b == 9){
			System.out.print("구십");
		}

		if(c == 1){
			System.out.println("일");
		}
		else if(c == 2){
			System.out.println("이");
		}
		else if(c == 3){
			System.out.println("삼");
		}
		else if(c == 4){
			System.out.println("사");
		}
		else if(c == 5){
			System.out.println("오");
		}
		else if(c == 6){
			System.out.println("육");
		}
		else if(c == 7){
			System.out.println("칠");
		}
		else if(c == 8){
			System.out.println("팔");
		}
		else if(c == 9){
			System.out.println("구");
		}


	}
}