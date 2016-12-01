public class ContactApp{
	public static void main(String[] args){
		//주소록정보(이름 여러개의 전화번호,주소)를 저장하는 객채 생성
		Contact c = new Contact();

		//이름 정보 저장
		String name = "홍길동";
		c.setName(name);

		//전화번호 정보 저장
		Tel[] p = new Tel[10];
		Tel t1 = new Tel();
		t1.setType("폰");	
		t1.setNumber("101010");
		p[0] = t1;
		
		Tel t2 = new Tel();
		t2.setType("놉");
		t2.setNumber("202020");
		p[1] = t2;

		Tel t3 = new Tel();
		t3.setType("돈");
		t3.setNumber("303030");
		p[2] = t3;

		Tel t4 = new Tel();
		t4.setType("돗");
		t4.setNumber("404040");
		p[3] = t4;

		c.setTels(p);

		//주소 정보 저장
		Address a1 = new Address();
		a1.setZipcode("모름");
		a1.setSido("서울특별시");
		a1.setGugun("종로구");
		a1.setDetail("봉익동 디아망빌딩 401호");

		c.setAddress(a1);
	}
}