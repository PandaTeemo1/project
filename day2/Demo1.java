public class Demo1{
	public static void main(String[] args){
		//���� Ÿ��
		byte b1 = 23;
		byte b2 = -126;
		//byte b3 = 128; �ڷ����� ������ ��� ������ �߻���

		int a1 = 120;
		int a2 = -120;
		
		long c1 = 100000;
		long c2 = 100000000000000000L;
		//������ ������ int�� ������ ����� ���� ��� �ݵ��
		//���ڳ��� L�� ǥ���ؾ� �Ѵ�.
		long c3 = 100000000000L;

		int m1 = 10; //10���� 10�� ǥ��
		int m2 = 012; //0���� �����ϸ� 8������ ������.
		int m3 = 0xA; // 16������ 10�� ǥ��

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);


		//java7 ���� ���ڸ� ������ �ڸ����� ǥ���ϱ� ���ؼ� _ ����� ����.
		int m4 = 100_000_000;
		int m5 = 5;
		System.out.println(m4*m5);
	}

}