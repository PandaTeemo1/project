public class SmartPhone extends Phone{
	
	private String ip;

	public SmartPhone(){
		System.out.println("SmartPhone() is running");
	}
	public SmartPhone(String tel, String company, String ip){
		super(tel, company);
		//super(tel,company);
		this.ip = ip;

		System.out.println("SmartPhone(String String String) is running");
	}

	public String getIp(){
		return ip;
	}
	public void setIp(String ip){
		this.ip = ip;
	}
}