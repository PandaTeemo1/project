import java.util.Random;
import java.util.Scanner;

public class Quizz3{
	public static void main(String[] args){
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int island = 0; // 0�̸� ���� 1�̸� ���ε�
		int count = 3;
		int total = 0;
		for(;;){
			System.out.println("----------------------------------");
			System.out.println("[1]�ֻ��� ������	[0]����");
			System.out.println("----------------------------------");
			System.out.print("�޴��� �����ϼ��� : ");
			int no = sc.nextInt();

			
			if(no == 1){
				int dice1 = ran.nextInt(6)+1;
				int dice2 = ran.nextInt(6)+1;

				if((dice1 + dice2) == 7){
					System.out.println("���ε��� �����ϴ�");
					island = 1;

				} else {
					System.out.println(dice2 + dice1 +"ĭ����ŭ �����ΰ��ϴ�");
					total = total + dice1 + dice2;
					System.out.println(total+"ĭ����ŭ ������ ���̽��ϴ�");
				}
			}
		}
	}
}