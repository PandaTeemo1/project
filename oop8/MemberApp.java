public class MemberApp{
	public static void main(String[] args){
		//ȸ�������� ������� member ��ü�� �����ϰ�
		//setter�� ����ؼ� �̸�,���̵�, ��й�ȣ, ���� ���� �����͸� ��ü�� �����ϱ�

		Member m = new Member();
		m.setName("ȫ�浿");
		m.setId("honggildong");
		m.setPassword("1234");
		m.setAge(27);
		//������ member ��ü�� ����� ���� getter�Լ��� ����ؼ� ȭ�鿡 ����ϱ�
		System.out.println("��    �� : "+m.getName());
		System.out.println("�� �� �� : "+m.getId());
		System.out.println("��й�ȣ : "+m.getPassword());
		System.out.println("��    �� : "+m.getAge());
	}
}