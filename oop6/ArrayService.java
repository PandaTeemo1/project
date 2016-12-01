//배열 이동시키기

// 배열 복사하기

//배열 잘라내기


public class ArrayService{
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};

	//arr1배열에서 지정된 번호를 찾아서 번호를 맨뒤로 보내기 
	
	public int[] move(int no){
		//원본에 복사본을 만들자
		int[] result = new int[arr1.length];
		for(int i = 0; i<arr1.length; i++){
			result[i] = arr1[i];
		}
		//제일 처음 덮혀쓰여질 값을 미리 보관해 두자
		int number = arr1[no-1];
		//배열의 값을 한 칸씩 앞으로 이동시키자
		for(int i=no; i<arr1.length; i++){
			result[i-1] = arr1[i];
		}
		//맨 마지막 값에 아까 보관해두었던 값을 담자.
		result[result.length-1]=number;
		System.out.println(java.util.Arrays.toString(result));
		
		return result;
	}
	public int[] copy(int index){
		int[] result = new int[arr2.length-index];
		for(int i=index; i<arr2.length; i++){
			result[i-index] = arr2[i];
		}
		System.out.println(java.util.Arrays.toString(result));
		return result;
	}
	public int[] cut(int begin, int end){
		int[] result = new int[end-begin+1];

		for(int i=begin; i<=end; i++){
			result[i-begin] = arr3[i];
		}
		System.out.println(java.util.Arrays.toString(result));
		return result;
	}
	public static void main(String[] args){
		ArrayService s = new ArrayService();
		s.move(3);
		s.copy(3);
		s.cut(3,8);
	}
}
	/*public int[] move(int no) {
		for(int i=0; i<arr1.length; i++){
			if(arr1[i] == no){
				for(int j = i; j<arr1.length-1; j++){
					arr1[j] = arr1[j+1];
				}
				arr1[arr1.length-1] = no;
			}
		}


		
		return arr1;	
	}
}
	//5,2 5번째를 2칸왼쪽으로 보내기
	//123456789
	//345678912
	public int[] shift(int begin, int step){
	
	}
	//arr2배열에서 지정된 위치부터 끝까지 복사된 배열을 반환하기
	public int[] copy(int begin) {
	
	}

	//arr3배열에서 지정된 위치부터 지정된 위치까지 복사된 배열 반환하기.
	public int[] cut(int begin, int end){
	
	}

}*/