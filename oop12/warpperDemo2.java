public class warpperDemo2{
	public static void main(String[] args){
		//Integer�� ���� �޼ҵ�

		//���ڿ��� int������ ��ȯ�ϴ� �޼ҵ� int parseInt(String text)
		int y = Integer.parseInt("123");

		System.out.println(y);

		int z = Integer.parseInt("111111", 2);

		System.out.println(z);

		int x = Integer.parseInt("abcdef", 16);
		System.out.println(x);

		String str1 = Integer.toBinaryString(12);
		System.out.println(str1);

		String str2 = Integer.toHexString(160);
		System.out.println(str2);

		double v = Double.parseDouble("3.14");
		System.out.println(v);
	}
}