import java.util.Scanner;

public class Quizz5{
	public static void main(String[] args){
		// ����, ����, ����, ������ �Է¹޾Ƽ�
		// ����, ���, ������ ����ϱ�
		// ������ 90�̻� : A, 80 :B 70 :C 60 :D �׿ܴ� F

		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		int avg = total / 3;
		System.out.println("���� : "+total+"�Դϴ�");
		System.out.println("��� : "+avg+"�Դϴ�");
		if(avg >= 90){
			System.out.println("A�����Դϴ�");
		}else if(avg >= 80){
			System.out.println("B�����Դϴ�");
		}else if(avg >= 70){
			System.out.println("C�����Դϴ�");
		}else if(avg >= 60){
			System.out.println("D�����Դϴ�");
		}else {
			System.out.println("F�����Դϴ�");
		}

	}
}