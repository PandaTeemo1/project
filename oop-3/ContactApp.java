import java.util.Scanner;

public class ContactApp{
	public static void main(String[] args){
		//����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		//������� �Է��� �о���� Scanner ��ü �����ϱ�
		Scanner s = new Scanner(System.in);
		
		
		Contact[] contact = new Contact[100];
		int currentPosition = 0;
		
		for(;;){
			System.out.println("1:���   2:��ȸ   3:����");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			int menunum = s.nextInt();
			if(menunum == 1){
				System.out.print("��ȣ : ");
				int no = s.nextInt();
				System.out.print("�̸� : ");
				String name = s.next();
				System.out.print("��ȭ��ȣ  : ");
				String number = s.next();
				System.out.print("�̸��� : ");
				String email = s.next();
				//Contact��ü �����ϰ�, ���� ���
				Contact contacts = new Contact();
				contacts.setNo(no);
				contacts.setName(name);
				contacts.setNumber(number);
				contacts.setEmail(email);
				//�迭�� �����ϱ�

				//mgr.addContact(contact);
				contacts[currentPosition] = contact;
				currentPosition++;
				
				//�迭�� ����ϱ�
				 //currentPosition�� ����Ű�� ��ġ�� Contact�� �����ϰ�
				// currentPosition�� ���� 1������Ų��.
				// mgr�� addContact(Contact contact) �޼ҵ忡 ����� contact��ä ����
				
			} else if(menunum == 2){
				//mgr.displayContact();
				for(int i=0; i<currentPosition; i++){
					contact c = contact[i];
					System.out.printf("%d %s %s %s\n", c.getNo(), c.getName(), c.getNumber(), c.getEmail());
				}
			}else if(menunum == 3){
				break;
			}
				//�迭�� ��ϵ� ��� ����ó ���� ǥ���ϱ�
				//<-- �ΰ��� ���ö����� ���� ���̸� break ����������
				//�迭���� 0���� currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ��ϱ�
				//mgr�� displayContact()�� �����Ű��.
			
			
		}

	}
}