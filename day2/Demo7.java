public class Demo7{
	public static void main(String[] args){
		//형변환 - 자동 형변환
		//큰 타입의 자료형에 작은 타입의 자료형을 담은 경우
		double a  = 10;
		System.out.println(a);
		//크기는 같지만, 정밀도가 높은 자료형에 정밀도가 낮은 자료형을 담은 경우
		float b = 10;
		System.out.println(b);

		char c = 65;
		int d = 'A';

		System.out.println(c);
		System.out.println(d);
	}
}