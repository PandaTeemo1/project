import java.util.StringTokenizer;

public class StringTokenizerDemo{
	public static void main(String[] args){
		String text = "�����ϴ�     �ǻ��    ����    �ƹ�    �˰�    �����ϴ�.";
		
		
		/*
		StringTokenizer st = new StringTokenizer(text);

		int length = st.countTokens();
		System.out.println(length);
		while (st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
			System.out.println("���� ��ū ���� : "+st.countTokens());
		
		
		*/
		String[] token = text.split(" ");
		System.out.println("�ܾ� ���� : "+token.length);

		/*
			StringTokenizer
				-���ڿ��� �����ڸ� �������� �߶� ��ū���� �����.
				-new StringTokenizer(�ؽ�Ʈ);			//�����ڸ� �������� ������ ������ �����ڰ� ��.
				-new StringTokenizer(�ؽ�Ʈ, ������);
				-boolean hasMoreToken() : �������� ���� ��ū(���ڿ�)�� �����ϸ� true�� ��ȯ�Ѵ�..
				-String nextToken() : ��ū(���ڿ�)�� ������.
		
		*/
		
		}

	}
