import java.util.Scanner;

public class Demo9{
	public static void main(String[] args){
		
		String[] name = {"��", "��", "��", "��", "��", "��", "ĥ", "��", "��", "��"};

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sip = number/10;
		int li = number -(sip*10);

		String hangul = name[sip-1] + "��" + name[li-1];
		System.out.println(hangul);
	}
}