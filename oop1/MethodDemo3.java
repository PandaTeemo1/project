import java.util.Random;

public class MethodDemo3{
	// ������ �߻���Ű�� �޼ҵ� �����
	public static int random(){
		Random rd = new Random();
		int number = rd.nextInt(100);

		//return Ű����� �� �޼ҵ带 ȣ���� ���� ���� ��ȯ�Ѵ�.
		return number;
	}

	public static void main(String[] args){
		int x = random();
		System.out.println(x);

		
	}

}