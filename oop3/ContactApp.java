import java.util.Scanner;

public ContactApp{
	public static void main(String[] args){
		//����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		//������� �Է��� �о���� Scanner ��ü �����ϱ�
		Scanner s = new Scanner(System.in);
		ContactMgr mgr = new ContactMgr();

		Contact[] contact = new Contact[100];
		int currentPosition = 0;
		for(;;){
			System.out.println("1:���   2:��ȸ   3:����");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			int menunum = sc.nextInt();
			if(menunum == 1){
				//�迭�� ����ϱ�
				// currentPosition�� ����Ű�� ��ġ�� Contact�� �����ϰ�
				// currentPosition�� ���� 1������Ų��.
				// mgr�� addContact(Contact contact) �޼ҵ忡 ����� contact��ä ����
				
			} else if(menunum == 2){
				//�迭�� ��ϵ� ��� ����ó ���� ǥ���ϱ�
				//<-- �ΰ��� ���ö����� ���� ���̸� break ����������
				//�迭���� 0���� currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ��ϱ�
				//mgr�� displayContact()�� �����Ű��.
			
			} else if(menunum == 3){
				break;
			}
		}

	}
}