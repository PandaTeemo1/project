public class Demo11
{
	public static void main(String[] args){
		//���� ������ �����ʿ� ���� ���ʿ� ����
		// ����켱 ������ ���� ����.
		// �캯�� ���� �º��� �����Ѵ�.
		int a = 20;
		int b = a;

		System.out.println("a��:"+a);
		System.out.println("b��:"+b);

		int x = 10;
		x = x + 3; // x�� ���� 3�� ���� ���� �ٽ� x�� �����Ѵ�.
		x += 3; // x�� ���� 3 ������Ų��.
		System.out.println("x�ǰ�"+x);
		x=3;//x�ǰ��� 3���� ����.
		
		x= x -3;
		x -= 3;
		System.out.println("x�ǰ�"+x);
	}
}