import java.util.Scanner;

public class Quizz5{
	public static void main(String[] args){
		// 국어, 영어, 수학, 점수를 입력받아서
		// 총점, 평균, 학점을 출력하기
		// 학점은 90이상 : A, 80 :B 70 :C 60 :D 그외는 F

		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		int avg = total / 3;
		System.out.println("총점 : "+total+"입니다");
		System.out.println("평균 : "+avg+"입니다");
		if(avg >= 90){
			System.out.println("A학점입니다");
		}else if(avg >= 80){
			System.out.println("B학점입니다");
		}else if(avg >= 70){
			System.out.println("C학점입니다");
		}else if(avg >= 60){
			System.out.println("D학점입니다");
		}else {
			System.out.println("F학점입니다");
		}

	}
}