public class Contact{
	//�Ӽ� �����ϱ�
	//���� 
	int no;
	//�̸� name
	String name;
	//����ó 
	String phoneNum;
	//�̸��� email
	String email;


	//��� �����ϱ�
	//��ȭ�ɱ� call()
	public void call(){//���赵 �̸��� �빮��
		System.out.println(phoneNum + "��ȭ�� �̴ϴ�");
	}
	//���ں����� sendMassage()
	public void sendMassage(){
		System.out.println(phoneNum + "���ڸ� �����ϴ�");
	}
	//���Ϻ����� sendeMail()
	public void sendeMail(){
		System.out.println(email + "������ �����ϴ�");
	
	}
}