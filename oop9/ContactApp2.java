import java.util.Scanner;

public class ContactApp2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Contact c = new Contact();
		Tel p = new Tel();
		Address a = new Address();

		for(;;){
			System.out.println("1.�̸� ���	2.��ȭ ���	3.�ּ� ���	4.��ȸ 5.����");
			System.out.print("�޴��� �����ϼ��� :");
			int num = sc.nextInt();
				
			if(num == 1){
				//�̸��� �Է¹޾Ƽ� Contact�� �����մϴ�.
				System.out.print("�̸��� �Է��Ͻÿ�");
				String name = sc.next();
				c.setName(name);
			}else if(num == 2){

				// ��ȭ��ȣ�� �Է¹޾Ƽ� Contact�� �����մϴ�.
				// Tel��ü ���� -> �� �Է¹޾Ƽ� ä��� -> Contact�� addTel(Tel tel)
				// ���� Tel ��ü �����ؼ� �迭�� ���
				System.out.print("����� �Է��� : ");
				String blah1 = sc.next();
				System.out.print("���ڶ� �Է��� : ");
				String blah2 = sc.next();
				p.setType(blah1);
				p.setNumber(blah2);
				c.addTel(p);


	
			}else if(num == 3){
				// �ּҸ� �Է¹޾Ƽ� Contact�� �����մϴ�.
				//address��ü ���� -> �� �Է¹޾Ƽ� ä��� -> Contact�� setter �̿��ؼ� ����
				//������ ������ ���� �����
				System.out.print("�õ��� �Է��Ͻÿ� : ");
				String blah3 = sc.next();
				System.out.print("������ �Է��Ͻÿ� : ");
				String blah4 = sc.next();
				System.out.print("���� �Է��Ͻÿ� : ");
				String blah5 = sc.next();
				System.out.print("�ڼ��� �Է��Ͻÿ� : ");
				String blah6 = sc.next();
				a.setSido(blah3);
				a.setGugun(blah4);
				a.setDetail(blah5);
				a.setZipcode(blah6);

				c.setAddress(a);
			}else if(num == 4){
				//����ó ������ ȭ�鿡 ǥ���մϴ�.
				c.displayContact();

			}else if(num == 5){
				break;
			}
		}
	}
}

/*
	Database�� ������� �ϴ� �۾�
	Create - �� ������ ����
	Retrieve - ������ ��ȸ
	Update - ������ ����
	Delete - ������ ����

*/