import java.util.Scanner;

public class Quizz1{
	public static void main(String[] args){
		//�̸����� �Է¹޾Ƽ� �̸��Ͽ� ���Ե� ���̵�κи� ����ϱ�

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸����� �Է��ϼ���: ");
		String str1 = sc.next();
		String[] str2 = str1.split("@");

		System.out.println(str2[0]);/*
		int i = str1.indexOf("@");
		String str2 = str1.substring(0,i);
		System.out.println(str2);
	*/
	}

}