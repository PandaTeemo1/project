import java.util.Scanner;

public class Demo7{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1:Ŀ��(1500) 2:�����꽺(2000) 3:�̿�����(1000��)");
		
		int coffee = 1500;
		int juice = 2000;
		int drick = 1000;

		int returnCoin = 0;
		
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int pay = sc.nextInt();
		System.out.print("���Ḧ ������ : ");
		int no = sc.nextInt();

		if(no == 1){
			System.out.println("Ŀ�Ǹ���������");
			//System.out.println("�Ž����� "+(pay-coffee)+"���Դϴ�");
			returnCoin = pay - coffee;
		}
		else if (no == 2){
			System.out.println("�����꽺�� ��������");
			//System.out.println("�Ž����� "+(pay-juice)+"���Դϴ�");
			returnCoin = pay - juice;
		}
		else if (no == 3){
			System.out.println("�̿����Ḧ ��������");
			//System.out.println("�Ž����� "+(pay-drick)+"���Դϴ�");
			returnCoin = pay - drick;
		}
		else {
			System.out.println("������ �߸�����ϴ�.");
			returnCoin = pay;
		}
		System.out.println("�Ž����� "+returnCoin);

		
	}
}