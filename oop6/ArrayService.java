//�迭 �̵���Ű��

// �迭 �����ϱ�

//�迭 �߶󳻱�


public class ArrayService{
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};

	//arr1�迭���� ������ ��ȣ�� ã�Ƽ� ��ȣ�� �ǵڷ� ������ 
	
	public int[] move(int no){
		//������ ���纻�� ������
		int[] result = new int[arr1.length];
		for(int i = 0; i<arr1.length; i++){
			result[i] = arr1[i];
		}
		//���� ó�� ���������� ���� �̸� ������ ����
		int number = arr1[no-1];
		//�迭�� ���� �� ĭ�� ������ �̵���Ű��
		for(int i=no; i<arr1.length; i++){
			result[i-1] = arr1[i];
		}
		//�� ������ ���� �Ʊ� �����صξ��� ���� ����.
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
	//5,2 5��°�� 2ĭ�������� ������
	//123456789
	//345678912
	public int[] shift(int begin, int step){
	
	}
	//arr2�迭���� ������ ��ġ���� ������ ����� �迭�� ��ȯ�ϱ�
	public int[] copy(int begin) {
	
	}

	//arr3�迭���� ������ ��ġ���� ������ ��ġ���� ����� �迭 ��ȯ�ϱ�.
	public int[] cut(int begin, int end){
	
	}

}*/