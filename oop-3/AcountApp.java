/*banking program
1.���µ�ϱ��
	�̸�, ��й�ȣ, ���� �Աݾ��� �Է¹޾Ƽ� ���¸� �����Ѵ�.
	���¹�ȣ�� �ڵ����� �����ǰԲ�
2.��ȸ���
	�̸�, ���¹�ȣ, �ܾ��� ǥ���Ѵ�.
3. ��й�ȣ ������
	���� ��й�ȣ�� �� ��й�ȣ�� �Է¹޾Ƽ� ��й�ȣ�� �����Ѵ�.
4. �Ա� ���
	�Աݾ��� �Է¹޾Ƽ� �ܾ��� ������Ų��.
5. ��� ���
	��ݾװ� ��й�ȣ�� �Է¹޾Ƽ� �ܾ��� ���ҽ�Ų��.
6. ����
	���α׷��� �����Ѵ�.
*/
import java.util.Scanner;

public class AcountApp{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		Acount a = new Acount();
		
		for(;;){
			System.out.println("1:���   2:��ȸ   3:��й�ȣ����	4:�Ա�	5:���	6:����");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			int menunum = s.nextInt();
			if(menunum == 1){
				System.out.print("�̸� : ");
				String name = s.next();
				System.out.print("���¹�ȣ : ");
				String acc = s.next();
				System.out.print("��й�ȣ  : ");
				int password = s.nextInt();
				System.out.print("�����Աݾ� : ");
				int money = s.nextInt();

				//Contact��ü �����ϰ�, ���� ���
				
				a.setName(name);
				a.setAcc(acc);
				a.setPassword(password);
				a.setMoney(money);
			} else if(menunum == 2){
				System.out.printf("%s %s %d %d\n", a.getName(), a.getAcc(), a.getPassword(), a.getMoney());
			} else if(menunum == 3){
				System.out.print("��й�ȣ�� �����ϱ����� ���� ��й�ȣ�� �����ּ��� : ");
				int nowPassword = s.nextInt();
				if(a.getPassword() == nowPassword){
					System.out.print("����� ��й�ȣ�� �����ּ��� : ");
					int nextPassword1 = s.nextInt();
					System.out.print("��й�ȣ�� �ѹ��� �����ּ��� : ");
					int nextPassword2 = s.nextInt();
					if(nextPassword1 == nextPassword2){
						System.out.println("��й�ȣ�� ����Ǿ����ϴ�");
						a.setPassword(nextPassword1);
					} else{
						System.out.println("��й�ȣ�� Ʋ���ϴ� �ٽ� �������ֽʽÿ�.");
					}

				}
			} else if(menunum == 4){
				System.out.print("�Ա��� �ݾ��� �־��ּ��� : ");
				int pay = s.nextInt();
				a.setMoney(a.getMoney()+pay);
				System.out.println(pay+"�� �ԱݵǼ̽��ϴ� �ܾ� : "+a.getMoney()+"�� �Դϴ�");
			} else if(menunum == 5){
				System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
				int password1 = s.nextInt();
				if(password1 == a.getPassword()){
					System.out.print("����� �ݾ��� �����ϼ��� : ");
					int pay2 = s.nextInt();
					a.setMoney(a.getMoney()-pay2);
					System.out.println(pay2+"�� ��ݵǼ̽��ϴ� �ܾ� : "+a.getMoney()+"�� �Դϴ�");
				}

			
			} else if(menunum == 6){
				System.out.println("�����մϴ�");
				break;
			}
	}
}
}