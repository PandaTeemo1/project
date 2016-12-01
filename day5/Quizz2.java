import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 숫자를 입력받아서 그 숫자들의 합과 평균을 계산해서 출력하기
		// 1. 학생 수를 입력받기
		// 2. 학생 수 만큼의 크기를 가진 배열을 만들기
		// 3. 학생 수 만큼 반복하면서 점수를 입력받고 배열에 담기
		// 4. 배열에 저장된 값으로 합계와 평균을 계산해서 출력하기

		System.out.print("국어 시험을 본 학생들의 수를 입력하세요:");
		int size = sc.nextInt();	// 학생수 == 배열의 크기
		// 학생 수 만큼의 점수를 담을 배열을 생성
		int[] scores = new int[size];	// 배열 만들기

		// 배열에 국어점수를 저장하기
		for (int i=0; i<size; i++) {
			System.out.print("국어점수를 입력하세요:");
			int score = sc.nextInt();

			scores[i] = score;
		}

		// 총점과 평균 계산하기
		int total = 0;
		int avg = 0;
		for (int score : scores) {
			total += score;
		}
		avg = total/size;
		
		System.out.printf("총점:%d  평균:%d\n", total, avg);



	}
}