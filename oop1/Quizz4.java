public class Quizz4{
	//�Ӽ�
	//�����ȣ
	int no;
	//�̸�
	String name;
	//��ȭ��ȣ
	String number;
	//�ҼӺμ�
	String department;
	//����
	String position;
	//�޿�
	int money;

	//���
	//������ ����ؼ� ��ȯ
	public int cal(){
		return money * 12;
	}
	//����� ��� ������ ����ϴ� �޼ҵ�
	public void data(){
		System.out.println("#### ��� ���� ####");
		System.out.println("�����ȣ : "+no);
		System.out.println("��    �� : "+name);
		System.out.println("��ȭ��ȣ : "+number);
		System.out.println("�ҼӺμ� : "+department);
		System.out.println("��    �� : "+position);
		System.out.println("��    �� : "+money);
		System.out.println("��    �� : "+cal());
		System.out.println("##################");

	}
}