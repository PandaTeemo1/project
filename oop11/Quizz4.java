import java.util.Scanner;
import java.util.regex.Pattern;

public class Quizz4{
	public static void main(String[] args){
		//���̵� �Է¹޾Ƽ� �ùٸ� ���̵����� �˻��ϱ�.
		//���̵� �ۼ� ��Ģ(���̰� 6���� �̻�, ����ҹ���97~122)
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];

		System.out.println("���̵� �Է��ϼ���");
		String str1 = sc.next();
		
		//�˻��ϱ�
		for(int i=0; i<str1.length(); i++){
			int a = str1.charAt(i)-97;
			if(a>=0){
				arr[a]++;
			}
		}
		
		//���̵� 6���� �̻����� �˻��ϱ�
		if(str1.length() <6){
			System.out.println("6���� �̻� �Է��ϼ���");
			return;
		}
		//���̵� ���� �ҹ��ڷθ� �����Ǿ��ִ��� �˻��ϱ�
		boolean invaild = false; //<--- flag ���� : ���� ������ Ư�� ���¸� �����ϴ� ����
		for(int i = 0; i<str1.length(); i++){
			int value = (int) str1.charAt(i);
			if(value < 97 || value > 122){
				invaild = true;
				break;
			}
			if(invaild){
				System.out.println("�ҹ��ڸ� �Է��� �� �ֽ��ϴ�.");
			}
		}
			
		/*boolean vaild = false;
		String regExp = "^[a-z]{6,}$";
		vaild = Pattern.matches(regExp, str1);

		if(vaild){
			System.out.println("��ȿ��������");

			
		}*/
	}

}
