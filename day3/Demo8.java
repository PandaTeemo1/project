import java.util.Scanner;

public class Demo8{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("1 : Ŀ��(1500��) 2 : �����꽺(2000��) 3 : �̿�����(1000��)");

		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		System.out.print("���Ḧ ������ : ");
		int no = sc.nextInt();

		int returnCoin = 0;

		if(no == 1) {
			System.out.println("Ŀ�Ǹ� �޾ư�����");
			returnCoin = money - 1500;
		}
		
		else if(no == 2) {
			System.out.println("�����꽺�� �޾ư�����");
			returnCoin = money - 2000;
		}
		
		else if(no == 3) {
			System.out.println("�̿����Ḧ �޾ư�����");
			returnCoin = money - 1000;
		}
		else {
			System.out.println("�߸��� �����Դϴ�.");
			returnCoin = money;
		}
		System.out.println("�Ž�����" + returnCoin);
		int j = returnCoin/10000;
		System.out.println("����" + j);
		int k = returnCoin/10000/10;
		System.out.println("��õ��" + k);
		int l = returnCoin/1000;
		System.out.println("õ��" +l);
		int u = returnCoin/500;
		System.out.println("�����" + u);
		int i = returnCoin/100;
		System.out.println("���" + i);
		
	}
}