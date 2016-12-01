public class ForDemo6{
	public static void main(String[] args){
		//1~100까지의 합을 계산하기
		//단 합계가 300을 넘어서는 순간의 숫자를 알아내기
		int total = 0;
		int number = 0;

		for (int a=1;a<=100; a++ ){
			number = a;
			total = total + a;
			if(total >= 3000){
				break;
			}
		}
		System.out.println(total);
		System.out.println(number);
	}
}