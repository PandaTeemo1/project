public class Contactapp{
	public static void main(String[] args){
		Contact c1 = new Contact();
		Contact c2 = new Contact();


		c1.no = 23;
		c1.name = "ȫ�浿";
		c1.phoneNum = "010-1234-5678";
		c1.email = "asdf@gmail.com";

		c2.no = 25;
		c2.name = "������";
		c2.phoneNum = "010-4321-8765";
		c2.email = "fdsa@gmail.com";
		System.out.println(c1.name);
		System.out.println(c1.no);
		System.out.println(c1.phoneNum);
		System.out.println(c1.email);
		c1.call();
		c2.call();
		/*
		Contact[]  contacts = new Contact[10];
		contacts[3] = c1;
		contacts[4] = c2;
		*/
	}
}
//�迭�� ���޹޾Ƽ� �� �迭���� ���� ū ���� ��ȯ�ϴ� �޼ҵ�
//�迭�� ���ڸ� ���޹޾Ƽ� �� �迭�� �� ���ڰ� ���ԵǾ� �ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�

//���� ������ �����ϰ� �� ������ ����ϴ� ����� ������ ���赵
//public class Employee{
	//�Ӽ�
	//�����ȣ, �̸�, ��ȭ��ȣ, �ҼӺμ�, ����, �޿�

	//���
	//������ ����ؼ� ��ȯ�ϴ� �޼ҵ�
	//����� ��� ������ ����ϴ� �޼ҵ�
}