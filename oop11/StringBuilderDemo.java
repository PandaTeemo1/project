public class StringBuilderDemo{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		sb.append("사랑한 기억도")
		.append("고마운 기억도")
		.append("모두 잊길 바래")
		.append("내눈물까지")
		.append("아파하지말고")
		.append("돌아보지말고")
		.append(333)
		.append(999);

		String text = sb.toString();
		System.out.println(text);
	}
}