import java.util.Scanner;
import java.util.Random;

public class Quizz3{
	public static void main(String[] args){

		Scanner sc = new.Scanner(System.in);
		Random ran = new.Random();

		int[] numbers = bew int[3];
		int position = 0;
		for(;;){
			int number = ran.nextInt(10);
			boolean
		System.out.println(Arrays.toString(numbers));
		int answerCount = 0;
		for(int i=1; i<=10; i++){
			int strike = 0;
			int ball = 0;

			int[] answer = bew int[3];

			System.out.print("첫번째 숫자를 입력하세요:");
			answer[0] = sc.nextInt();
			System.out.print("첫번째 숫자를 입력하세요:");
			answer[1] = sc.nextInt();
			System.out.print("첫번째 숫자를 입력하세요:");
			answer[2] = sc.nextInt();

			for(int a=0; a<3; a++){
				for(int b=0; b<3; b++){
					if(numbers[a] == answer[b]) {
						if(a==b){
							strike++;
						}else{
							ball++;
						}
					}
				}
			}
			System.out.printf("s:%d b:%d\n", strike, ball);

			if(strike == 3) {
				break;
			}
			answerCount++;
			System.out.println(10-answerCount + "회 남았습니다.");
		}
		System.out.println("종료");
	}
}