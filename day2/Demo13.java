public class Demo13
{
	public static void main(String[] args){
		//����������
		// ++ 1�� ���� --1�� ����

		int a = 3;
		a++;
		++a;
		System.out.println("a�ǰ�:"+a);

		--a;
		a--;
		--a;
		System.out.println("a�ǰ�:"+a);

		int x = 10;
		int y = 10;
		//���������ڸ� �ٸ� �����ڿ� ȥ���ؼ� ����ϸ�
		//������������ ��ġ�� ���� �ٸ� ����� ����� �� �ֱ� ������
		//�����ϸ� �ٸ� �����ڿ� ȥ���ؼ� ������� ����.
		int m = x++; //x�ǰ��� m�� �����ϰ� ����
		int n = ++y; //y�� ���� �����ϰ� n�� ����

		System.out.println("m�� ��:"+m);
		System.out.println("n�� ��:"+n);
		System.out.println("x�� ��:"+x);
		System.out.println("y�� ��:"+y);
	}
}