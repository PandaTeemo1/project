public class FindSecondLargestNumber {
	public static void main(String[] args) {
		FindSecondLargestNumber findsecondLargestnumber = new FindSecondLargestNumber();
		System.out.println(findsecondLargestnumber.secondLargest(new int[] { 9459, 9575, 5692, 1305, 1942, 9012 }));
	}

	int secondLargest(int[] arr) {
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
