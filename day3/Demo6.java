import java.util.Scanner;

public class Demo6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("사용 기간을 입력하세요(년) : ");
		int year = sc.nextInt();
		System.out.print("운행거리를 입력하세요(km) : ");
		int distance = sc.nextInt();

		if(year >=5 || distance>=100000){
			System.out.println("유상수리대상");
		}
		else {
			System.out.println("무상수리대상");
		}
		
		
	}
}