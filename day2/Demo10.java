public class Demo10
{
	public static void main(String[] args){
		//��� ������

		int a = 10;
		int b = 5;
		//������ �׻� ���ο� ���� �����س���.
		//�ݵ�� �� ���� ������ ����.
		int c = a + b;

		int d = a - b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		System.out.println(g);
		//�����ڴ� ���ڿ��� ���� ���� ��� �̾���̱�� �����Ѵ�.
		//"���ڿ�" + ���� = "���ڿ�����"
		// ���� + "���ڿ�" = "���ڹ��ڿ�"
		//���ڿ� + ���ڿ� = ���ڿ����ڿ�

		String x = "�����ٶ�";
		String y = "hello";

		String z = x + y;
		System.out.println(z);

		System.out.println(3 + 6 + "Hello");
		// 3+ 6= 9 + Hello = 9Hello
		System.out.println("Hello" + 3 + 6);
		// Hello+3 = Hello3 + 6 = Hello36

		System.out.println("Hello" + (3 + 6));
		// Hello + (9) = Hello9

		int kor = 70;
		int eng = 80;
		int math = 20;

		System.out.println("����:"+ (kor + eng + math));
		//����:170
	}
}