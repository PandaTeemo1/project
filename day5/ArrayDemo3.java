public class ArrayDemo3 {
	public static void main(String[] args) {
		
		int[] numbers = new int[3];

		// 배열의 지정된 위치에 값을 저장하기
		// numbers[인덱스] = 값;
		numbers[0] = 12;
		numbers[1] = 23;
		numbers[2] = 56;
		//numbers[3] = 100;	// 오류 발생 - ArrayIndexOutOfBoundsException 발생

		for (int a : numbers) {
			System.out.println(a);
		}
	}
}