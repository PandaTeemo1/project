public class PhoneApp{
	public static void main(String[] args){
		Phone p1 = new Phone();
		p1.setTelNumber("010-1111-1234");
		p1.setCompany("ũƮ");

		Phone p2  = new Phone("010101010","��ũ");

		p1.displayInfo();
		p2.displayInfo();
	}
}