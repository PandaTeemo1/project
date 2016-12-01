import java.util.Scanner;

public class Quizz1{
	public static void main(String[] args){
		//이메일을 입력받아서 이메일에 포함된 아이디부분만 출력하기

		Scanner sc = new Scanner(System.in);

		System.out.print("이메일을 입력하세요: ");
		String str1 = sc.next();
		String[] str2 = str1.split("@");

		System.out.println(str2[0]);/*
		int i = str1.indexOf("@");
		String str2 = str1.substring(0,i);
		System.out.println(str2);
	*/
	}

}