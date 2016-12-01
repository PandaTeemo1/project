public class Quizz4{
	//속성
	//사원번호
	int no;
	//이름
	String name;
	//전화번호
	String number;
	//소속부서
	String department;
	//직위
	String position;
	//급여
	int money;

	//기능
	//연봉을 계산해서 반환
	public int cal(){
		return money * 12;
	}
	//사원의 모든 정보를 출력하는 메소드
	public void data(){
		System.out.println("#### 사원 정보 ####");
		System.out.println("사원번호 : "+no);
		System.out.println("이    름 : "+name);
		System.out.println("전화번호 : "+number);
		System.out.println("소속부서 : "+department);
		System.out.println("직    위 : "+position);
		System.out.println("급    여 : "+money);
		System.out.println("연    봉 : "+cal());
		System.out.println("##################");

	}
}