import java.util.Random;

public class MethodDemo4{
	public static int random(){
		Random rd = new Random();
		int number = rd.nextInt(100);

		//return Ű����� �� �޼ҵ带 ȣ���� ���� ���� ��ȯ�Ѵ�.
		return number;
	}
	public static void main(String[] args){
		int x = random();
		System.out.println(x);

		System.out.println(random());
		System.out.println(random() * 100);
		//System.out.println(a() * 100);
	}
}