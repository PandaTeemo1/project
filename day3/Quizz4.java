import java.util.Scanner;

public class Quizz4{
	public static void main(String[] args){
		//������ ���ڸ� ���ڸ� �Է¹޾Ƽ� �� ���ڿ� �ش��ϴ� �ѱ۷� ��ȭ�ϱ�
		//��) 23 -> �̽ʻ�
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� ���ڸ� �Է��ϼ��� : ");
		int a = sc.nextInt();

		int b = a/10;
		int c = a-(b*10);
		

		if(b == 1){
			System.out.print("��");
		}
		else if(b == 2){
			System.out.print("�̽�");
		}
		else if(b == 3){
			System.out.print("���");
		}
		else if(b == 4){
			System.out.print("���");
		}
		else if(b == 5){
			System.out.print("����");
		}		
		else if(b == 6){
			System.out.print("����");
		}
		else if(b == 7){
			System.out.print("ĥ��");
		}
		else if(b == 8){
			System.out.print("�Ƚ�");
		}
		else if(b == 9){
			System.out.print("����");
		}

		if(c == 1){
			System.out.println("��");
		}
		else if(c == 2){
			System.out.println("��");
		}
		else if(c == 3){
			System.out.println("��");
		}
		else if(c == 4){
			System.out.println("��");
		}
		else if(c == 5){
			System.out.println("��");
		}
		else if(c == 6){
			System.out.println("��");
		}
		else if(c == 7){
			System.out.println("ĥ");
		}
		else if(c == 8){
			System.out.println("��");
		}
		else if(c == 9){
			System.out.println("��");
		}


	}
}