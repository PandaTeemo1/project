public class PhoneApp {
	public static void main(String[] args){
		
		SmartPhone p = new SmartPhone();

		p.telNumber = "010-1234-1234";
		p.call("010-1234-4321");

		p.massage("010-1234-4321", "ȥ�ڿԾ��?");
		p.ip =  "255.255.255.0";
		p.web("http://www.naver.com");
		p.email = "yourfunny@naver.com";
		p.sendEmail("ddolki3@gmail.com","ȥ�ڿԴ�","���̿Դ�");

		PeaturePhone q = new PeaturePhone();
		q.telNumber = "010-4321-1234";
		q.call("016-7477-8291");
		q.massage("017-443-2123","��ȭ��");
		q.keypad();
	}
}