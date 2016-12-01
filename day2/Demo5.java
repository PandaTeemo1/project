public class Demo5{
	public static void main(String[] args){
		//문자열 타입 <- 문자열(1글자 이상의 문자들)은 쌍따음표로 표시
		String s1 = "서울특별시 종로구 봉익동";
		String s2 = "서울특별시 \n종로구 \n봉익동";

		System.out.println(s1);
		System.out.println(s2);
	}
}