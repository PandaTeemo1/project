public class StringBuilderDemo{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		sb.append("����� ��ﵵ")
		.append("���� ��ﵵ")
		.append("��� �ر� �ٷ�")
		.append("����������")
		.append("������������")
		.append("���ƺ�������")
		.append(333)
		.append(999);

		String text = sb.toString();
		System.out.println(text);
	}
}