public class ArrayDemo2 {
	public static void main(String[] args) {
		// 배열 생성하기
		// int[] arr1 = {1, 2, 4, 5, 6};	<-- 값을 가지고 있는 배열 생성
		// int[] arr2 = new int[3];			<-- 값 3개를 담을 수 있는 배열 생성
		//									<-- 정수형 배열의 기본값 0으로 채워져 있다.
		//	정수형은 0, 실수형은 0.0, 문자형은 \u0000, 불린형은 false, 참조형은 null
		int[] numbers = new int[3];
		System.out.println(numbers[0]);		// 0이 출력된다.
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		//System.out.println(numbers);

		String[] names = new String[3];
		System.out.println(names[0]);		// null이 출력된다.
		System.out.println(names[1]);
		System.out.println(names[2]);
		//System.out.println(names);
	}
}