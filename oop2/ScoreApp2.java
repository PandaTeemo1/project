public class ScoreApp2{
	public static void main(String[] args){
		//��ä ���� �� ȫ�浿�л��� �������� ��ä�� �ʱ�ȭ�Ǿ���.
		Score c =new Score();

		//������ ��ü�� �ʵ带 �ʱ�ȭ�ϴ� ������ �����Ҽ��ִ�.

		//�ٷ� ����� ����� �����ϴ�.
		int total = c.total();
		double avg = c.avg();

		System.out.println("�̸� : "+c.name);
		System.out.println("���� : "+total);
		System.out.println("��� : "+avg);

	}
}