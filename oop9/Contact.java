public class Contact{
	private String name;
	private Tel[] tels = new Tel[50];
	private Address address; //포함관계
	private Contact[] contacts = new Contact[100];
	public Contact() {}
	int currentPosition =0;

	public Contact(String name, Tel[] tels, Address address){
		this.name = name;
		this.tels = tels;
		this.address = address;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void addTel(Tel tel){
		//Tel배열에 적절한 위체 담기
		tels[currentPosition] = tel;
		currentPosition++;
	}
	public Tel[] getTels(){
		return tels;
	}
	public void setTels(Tel[] tels){
		this.tels = tels;
	}
	public Address getAddress(){
		return address;
	}
	public void setAddress(Address address){
		this.address = address;
	}
	public void displayContact(){
		System.out.printf("%s\n", getName());
		for(int i = 0; i<currentPosition; i++){

			System.out.printf("%s %s\n", tels[i].getType(), tels[i].getNumber());
		}
		System.out.printf("%s %s %s %s\n",
			"시도 : "+address.getSido(), "구군 : "+ address.getGugun(), "집 : "+ address.getDetail(),"자세히 : "+ address.getZipcode());
	}	
}