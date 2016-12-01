import java.util.*;

public class Quizz1
{
	public static void main(String[] args){
		//국어, 영어, 수학점수를 입력받아서
		// 총점과 평균을 계산하기
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		double avg = total/3;

		System.out.println("총점 : "+total +"\t평균 : "+avg);
	}
}