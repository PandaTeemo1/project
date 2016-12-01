import java.util.Scanner;

public class Quizz3{

	public static void main(String[] args){
		//임의의 숫자를 입력받아서 그 수가 짝수인지 홀수인지
		//실행 연산자를 이용해서 결과를 표시하기

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를입력하세요 : ");
		//변수 a는 숫자를 받아온다
		int a = sc.nextInt();
		//만약에 a를 나눠서 나머지값 1이 발생하면
		if((a%2) == 1){
			System.out.println("홀수입니다");
		//그게 아니면
		}else{
			System.out.println("짝수입니다");
		}
	}
}