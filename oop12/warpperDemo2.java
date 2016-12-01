public class warpperDemo2{
	public static void main(String[] args){
		//Integer의 정적 메소드

		//문자열을 int값으로 변환하는 메소드 int parseInt(String text)
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