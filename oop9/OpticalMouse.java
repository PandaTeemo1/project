public class OpticalMouse implements Mouse, lightable {

	//Mouse�������̽��� ���ǵ� �߻�޼ҵ� ����
	public void wheel(){
		System.out.println("���� ��½�̸� ���� ����");
	}
	public void click(){
		System.out.println("���� ��½�̸� Ŭ��.. Ŭ��..");
	}
	public void move(){
		System.out.println("���� ��½�̸� ����... ����..");
	}

	//lightable�������̽��� ���ǵ� �߻�޼ҵ� ����
	public void light(){
		System.out.println("��¦ ��¦ ��Ӹ�");
	}
	//Cleanable�������̽��� ���ǵ� �߻�޼ҵ� ����
	/*public void clean(){
		if(mouse instanceof Cleanable){
			((Cleanable)mouse).clean();

		} else {
			System.out.println("û�ұ���� �������� �ʽ��ϴ�.");
		}
	}*/
}