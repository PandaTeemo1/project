import java.util.Scanner;

public class Quizz3{

	public static void main(String[] args){
		//������ ���ڸ� �Է¹޾Ƽ� �� ���� ¦������ Ȧ������
		//���� �����ڸ� �̿��ؼ� ����� ǥ���ϱ�

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ��Է��ϼ��� : ");
		//���� a�� ���ڸ� �޾ƿ´�
		int a = sc.nextInt();
		//���࿡ a�� ������ �������� 1�� �߻��ϸ�
		if((a%2) == 1){
			System.out.println("Ȧ���Դϴ�");
		//�װ� �ƴϸ�
		}else{
			System.out.println("¦���Դϴ�");
		}
	}
}