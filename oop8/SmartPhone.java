public class SmartPhone extends Phone{
	private String ip;

	public SmartPhone (){
	
	}
	public SmartPhone(String ip, String company, String telNumber){
		super(telNumber, company);//부모의 생성자 호출하기 Phone(String, String) 생성자
		this.ip = ip;
		
	}
	public String getIp(){
		return ip;
	}
	public void setIp(String ip){
		this.ip = ip;
	}

	public void displayInfo(){
		//System.out.println("전화번호 : " + getTelNumber());
		//System.out.println("통 신 사 : " + getCompany());
		super.displayInfo();
		System.out.println("아 이 피 : " + ip);
		System.out.println(super.this);
	}
}