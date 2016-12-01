public class Phone{
	
	private String tel;
	private String company;

	public Phone() {
		System.out.println("Phone() is running");
	}

	public Phone(String tel, String company){
		System.out.println("Phone(String, String) is running");
		this.tel =tel;
		this.company = company;
	}
	public String getTel(){
		return tel;
	}
	public void setTel(String tel){
		this.tel= tel;

	}
	public String getCompany(){
		return company;
	}
	public void setCompany(String company){
		this.company = company;
	}
}