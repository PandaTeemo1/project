public class Demo3
{
	public static void main(String[] args){
		//삼항 연산자
		// 조건식 ? 참일때 연산식 혹은 값 : 거짓일 때 연산식 혹은 값


		//점수가 60점 이상이면 합격 아니면 불합격
		int a = 67;

		String result = (a >= 60 ? "합격" : "불합격");
		System.out.println(result);

		// 구매금액이 5만원이면 배송비 0원
		// 구매금액 5만원미만이면 배송비 2500원

		int price = 25000;
		int credit = (price >= 50000 ? price : price+2500);

		System.out.println(credit);
	}
}