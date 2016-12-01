public class Quizz2 {
	public static void main(String[] args) {
		Quizz2 qz2 = new Quizz2();
		System.out.println(qz2.findfirst(new int[] { 9459, 9575, 5692, 1305, 1942, 9012 }));
	}

	int findfirst(int[] arr) {
		int first;
		int second;
		
		if (arr[0] < arr[1]) {
			first = arr[1];
			second = arr[0];
		} else {
			first = arr[0];
			second = arr[1];
		}
		for (int i = 2; i < arr.length; i++) {
			if (first < arr[i]) {
				second = first;
				first = arr[i];
			} else if (arr[i] < first && arr[i] > second) {
				second = arr[i];
			}
		}
		return first;
	}

}
