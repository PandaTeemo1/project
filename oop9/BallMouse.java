public class BallMouse implements Mouse, Cleanable{

	//Mouse�������̽��� ���ǵ� �߻�޼ҵ� ����	
	public void wheel(){
		System.out.println("���ۺ�����");
	}
	public void click(){
		System.out.println("����");
	}
	public void move(){
		System.out.println("�뱼�뱼");
	}
	public void clean(){
		System.out.println("Ball�� ���� ���� �Ϸ�....");
	}
}