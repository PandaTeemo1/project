import java.util.StringTokenizer;

public class Quizz5{
	public static void main(String[] args){
		String[] words ={"����", "�ð�����ǳ1", "�������", "��siri", "�ڤ���"};
		String text = "��� �Բ� �ð�����ǳ���� �ڡ�������� ���� �� ������ڡ� ���Խ�$$���� ī����<<�޸�100%������ ���ӽ� 300��� $$ �پ��� ������ $$";

		boolean isContains = false;
	/*	for(int i = 0; i<words.length; i++){
			if(text.contains(words[i])) {
				System.out.println("��Ģ�� "+words[i]+"�� ���ԵǾ����ϴ�");
				break;
			}
			System.out.println(words[i]);
		}*/
		for(String s : words){
			boolean value = text.contains(s);
			if(value) {
				isContains = true;
				System.out.println(value);
			} 
			
		}
	}
}