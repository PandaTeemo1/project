public class Quizz1 {

	public static void main(String[] args) {
		// 배열에서 가장 큰 숫자 찾기

		// 가장 큰 값을 담을 변수
		int max = 0;

		int[] numbers = {1, 3, 7, 4, 2, 6};

		for (int n : numbers) {
			// 구현하기
			if (n > max) {
				max = n;
			}

		}
		System.out.println("가장 큰 수: " + max);
	}
}