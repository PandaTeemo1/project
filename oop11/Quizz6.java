public class Quizz6{
	public static void main(String[] args){

		//이름 부서 직위 급여를 담을 수 있는 Employee 클래스 정의하기
		//필드 정의, 기본생성자 getter/setter
		//^를 기주으로 문자열 잘라서 배열에 담기 split
		//배열에 사원정보를 하나씩 추출해서, 로 잘라서 배열에 담기
		//Employee 객체를 만들어서 사원정보의 각 데이터를 employee 객체에 저장하기
		//Employee 객체를 employee 배열에 저장하기
		// Employee 배열에 저장된 정보 출력하기.

		String text = "홍길동,영업팀,과장,300^김유신,영업팀,부장,300^강감찬,총무부,대리,150^이순신,총무부,차장,200^";

		//replace(" ","");

		Employee[] e = new Employee[4];
		
		String a[] = text.split("\\^");

		for(int i = 0; i < a.length; i++){
			e[i] = new Employee();
			int j = a[i].indexOf(",");
			e[i].setDlfma(a[i].substring(0, j));
			a[i] = a[i].substring(j+1,a[i].length());
			
			j = a[i].indexOf(",");
			e[i].setQntj(a[i].substring(0, j));
			a[i] = a[i].substring(j+1,a[i].length());

			j = a[i].indexOf(",");
			e[i].setWlrrmq(a[i].substring(0, j));
			a[i] = a[i].substring(j+1,a[i].length());

			e[i].setRmqdu(Integer.parseInt(a[i].substring(0, a[i].length())));
		}
		for(Employee s : e){
			s.Info();
		}
	}
}