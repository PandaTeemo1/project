import java.util.*;

public class Quizz2
{
	public static void main(String[] args){
		//3�ڸ��� ������ �Է¹޾Ƽ�
		// 100���� �ڸ� ����
		// 10�� �ڸ� ����
		// 1�� �ڸ� ���ڸ� ���� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ���:");
		int number = sc.nextInt();

		int h = number/100;
		int j = (number- 100*h)/10;
		int k = (number - 100*h)- 10*j;

		System.out.println(h);
		System.out.println(j);
		System.out.println(k);

		System.out.println("100�ڸ��� ����" + number/100);
		System.out.println("10�ڸ��� ����"+ (number %= 100)/10);
		System.out.println("1�ڸ��� ����"+ (number %= 10));

	}

}