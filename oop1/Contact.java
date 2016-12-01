public class Contact{
	//속성 정의하기
	//순번 
	int no;
	//이름 name
	String name;
	//연락처 
	String phoneNum;
	//이메일 email
	String email;


	//기능 정의하기
	//전화걸기 call()
	public void call(){//설계도 이름만 대문자
		System.out.println(phoneNum + "전화를 겁니다");
	}
	//문자보내기 sendMassage()
	public void sendMassage(){
		System.out.println(phoneNum + "문자를 보냅니다");
	}
	//메일보내기 sendeMail()
	public void sendeMail(){
		System.out.println(email + "메일을 보냅니다");
	
	}
}