public class StringDemo{
	public static void main(String[] args){
		//객체를 만들기 위해선 생성자를 호출해야됨
		//생성자를 만들지 않고 객체를 생성할수 있는 유일한 방법은 스트링
		/*
			String 클래스
				String 클래스는 문자열을 표현한다.
				String값은 불변값이다. 한번 만들어진 이후에는 변경할 수 없다.
				String은 객체를 생성하는 특별한 방법을 제공한다.
					String str = new String("abc");	//생성자를 이용한 String 객체 생성
					String str = "abc";				//문자열 표현식을 이용한 String 객체 생성

				Employee emp = new Employee();
				emp.setNo(12);

				Ransdom ran = new Random();
				ran.nextInt();

				String str = new String("abc");
				String str = "abc";
				str.toUpperCase();

				"abc".toUpperCase();
		*/
		String str = "";
		//문자열의 길이를 반환하는 메소드 length;
		int len = str.length();
		System.out.println(len);

		//문자열이 비어있는지 여부를 반환하는 메소드 : boolean isEmpty()
		boolean empty = str.isEmpty();
		System.out.println("빈 문자열인가 : "+empty);

		//단어와 단어 사이에 공백은 의미가 있다고 생각함
		//문자열에서 의미없는 공백을 제거한 새로운 문자열을 반환하는 메소드 : String trim();
		//문자열의 전후 공백을 제거.
		String str2 = "      홍 길동       ";
		String str3 = str2.trim();
		System.out.println(str2);
		System.out.println(str3);

		//문자열의 내용을 비교해서 동일한 내용을 가진 문자열인지 여부를 반환하는 메소드

		String str4 = "애플";
		String str5 = "애플";

		boolean equa1 = str4.equals(str5);
		System.out.println("동일한 문자열 인가 ? "+equa1);

		String str6 = "apple";
		String str7 = "Apple";

		boolean equa2 = str6.equalsIgnoreCase(str7);
		System.out.println("대소문자 구분ㄷ없이 비교했을 때 동일한 문자열인가 ? "+equa2);

		//문자열이 지정한 문자열을 포함하고 있는지 여부를 반환하는 메소드 boolean contains(CharSequene s)
		String str8 = "자바 프로그래밍 - 자바 기초 및 응용";
		boolean contains = str8.contains("자바");
		System.out.println("[자바]라는 문자열을 포함하고 있는지 : "+contains);

		//문자열에서 지정된 위치의 문자(char)를 반환하는 메소드 : char charAt(int index);
		char ch = str8.charAt(1);
		System.out.println("1번째 문자열은 : " +ch);

		//문자열에서 지정된 문자열이 처음으로 등장하는 위치를 반환하는 메소드 : int indexOf(String str)
		int indexs = str8.indexOf("프로그래");
		System.out.println("문자열에서 [프로그]라는 글자가 처음으로 등장하는 위치는: "+indexs);//없으면 -1 반환

		//문자열의 내용을 지정된 문자열로 대체한 새로운 문자열을 반환하는 메소드 : String replace(String target, String str)
		String str9 = str8.replace("자바", "파이썬");
		System.out.println(str8);
		System.out.println(str9);

		//문자열에서 지정된 위치부터 끝까지 문자열을 잘라서 반환하는 메소드 String substring(int beginIndex)
		String str10 = "abcdefghijklmn";
		String str11 = str10.substring(5);
		System.out.println(str11);

		//문자열에서 지정된 구간의 문자열을 잘라서 반환하는 메소드 : String substring(int begin, int end)
		//시작위치는 포함, 끝위치는 포함하지 않는다.
		String str12 = str10.substring(0, 4);
		System.out.println(str12);

		String name1 = "홍길동";
		String str13 = name1.substring(0, 1);
		System.out.println(str13);

		//문자열을 지정한 구분자를 기준으로 잘라서 배열로 반환하는 메소드 : String[] split(String delim)
		String text = "서울, 경기, 인천, 대전, 부산, 광주, 울산, 대구";
		String[] str14 = text.split(", ");
		System.out.println(str14[0]);
		System.out.println(str14[2]);

		//문자열을 소문자,대문자로 변환한 새로운 문자열을 반환하는 메소드
		//String toUpperCase(), String toLowerCase()
		String str15 = "Pump";
		String str16 = str15.toUpperCase();
		String str17 = str15.toLowerCase();
		System.out.println(str16);
		System.out.println(str17);

		//정수, 실수, 불린, 기타 여러 종류의 값들을 문자열로 반환해서 반환하는 정적 메소드
		//String valueOf(int value) String valueOf(double value) String valueOf(boolean value)
		int number = 102030;
		//숫자 102030을 문자열 "102030"으로 변환해서 반환한다.
		String str18 = String.valueOf(number);
		System.out.println(str18);
		
		double number1 = 1.323;
		//실수 1.323을 문자열 "1.323"으로 변환해서 반환한다.
		String str19 = String.valueOf(number1);
		System.out.println(str19);
		
		boolean boolean1 = false;
		//거짓값 false를 문자열 "false"로 변환해서 반환한다.
		String str20 = String.valueOf(boolean1);
		System.out.println(boolean1);

		String str21 = str18.substring(str18.length()-1);
		System.out.println(str21);

		String str22 = 1234 + "";
		System.out.println(str22);

	}
}
//string은 상수다 그값은 절대바뀌지앟는다
