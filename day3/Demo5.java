public class Demo5
{
	public static void main(String[] args){
		System.out.println("프로그램을 시작합니다.");
		//변수 score 값이 60이상일때 합격입니다 출력
		int score = 50;
		
		if (score >= 60)
		{
			System.out.println("합격입니다");
			
			if(score > 95) {
				System.out.println("장학금을 지급합니다.");
			}
		}

		else{
			System.out.println("불합격입니다");
		}

		System.out.println("프로그램을 종료합니다.");
		
	}
}
