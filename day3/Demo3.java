public class Demo3
{
	public static void main(String[] args){
		//���� ������
		// ���ǽ� ? ���϶� ����� Ȥ�� �� : ������ �� ����� Ȥ�� ��


		//������ 60�� �̻��̸� �հ� �ƴϸ� ���հ�
		int a = 67;

		String result = (a >= 60 ? "�հ�" : "���հ�");
		System.out.println(result);

		// ���űݾ��� 5�����̸� ��ۺ� 0��
		// ���űݾ� 5�����̸��̸� ��ۺ� 2500��

		int price = 25000;
		int credit = (price >= 50000 ? price : price+2500);

		System.out.println(credit);
	}
}