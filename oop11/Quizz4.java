import java.util.Scanner;
import java.util.regex.Pattern;

public class Quizz4{
	public static void main(String[] args){
		//아이디를 입력받아서 올바른 아이디인지 검사하기.
		//아이디 작성 규칙(길이가 6글자 이상, 영어소문자97~122)
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];

		System.out.println("아이디를 입력하세요");
		String str1 = sc.next();
		
		//검사하기
		for(int i=0; i<str1.length(); i++){
			int a = str1.charAt(i)-97;
			if(a>=0){
				arr[a]++;
			}
		}
		
		//아이디가 6글자 이상인지 검사하기
		if(str1.length() <6){
			System.out.println("6글자 이상 입력하세요");
			return;
		}
		//아이디가 영어 소문자로만 구성되어있는지 검사하기
		boolean invaild = false; //<--- flag 변수 : 로직 수행의 특정 상태를 저장하는 변수
		for(int i = 0; i<str1.length(); i++){
			int value = (int) str1.charAt(i);
			if(value < 97 || value > 122){
				invaild = true;
				break;
			}
			if(invaild){
				System.out.println("소문자만 입력할 수 있습니다.");
			}
		}
			
		/*boolean vaild = false;
		String regExp = "^[a-z]{6,}$";
		vaild = Pattern.matches(regExp, str1);

		if(vaild){
			System.out.println("유효하지안흥");

			
		}*/
	}

}
