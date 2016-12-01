import java.util.*;

public class Quizz2
{
	public static void main(String[] args){
		//3자리의 정수를 입력받아서
		// 100백의 자리 숫자
		// 10의 자리 숫자
		// 1의 자리 숫자를 각각 출력하시오.
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요:");
		int number = sc.nextInt();

		int h = number/100;
		int j = (number- 100*h)/10;
		int k = (number - 100*h)- 10*j;

		System.out.println(h);
		System.out.println(j);
		System.out.println(k);

		System.out.println("100자리의 숫자" + number/100);
		System.out.println("10자리의 숫자"+ (number %= 100)/10);
		System.out.println("1자리의 숫자"+ (number %= 10));

	}

}