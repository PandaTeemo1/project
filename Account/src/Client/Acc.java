package Client;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Acc {
	private StringProperty id = new SimpleStringProperty();
	private StringProperty pwd = new SimpleStringProperty();
	private StringProperty name = new SimpleStringProperty();
	private StringProperty email = new SimpleStringProperty();
	private StringProperty phone = new SimpleStringProperty();
	
	public Acc(){
		
	}
	
	
	public Acc(String id, String pwd, String name, String email, String phone) {
		super();
		this.name.set(name);
		this.id.set(id);
		this.pwd.set(pwd);
		this.email.set(email);
		this.phone.set(phone);
	}


	public String getName(){
		return name.get();
	}
	public void setName(String name){
		this.name.set(name);
	}
	public StringProperty nameProperty(){
		return name;
	}
	
	public String getPhone(){
		return phone.get();
	}
	public void setPhone(String phone){
		this.phone.set(phone);
	}
	public StringProperty phoneProperty(){
		return phone;
	}
	
	public String getEmail(){
		return email.get();
	}
	public void setEmail(String email){
		this.email.set(email);
	}
	public StringProperty emailProperty(){
		return email;
	}
	
	public String getId(){
		return id.get();
	}
	public void setId(String id){
		this.id.set(id);
	}
	public StringProperty IdProperty(){
		return id;
	}
	
	public String getPwd(){
		return pwd.get();
	}
	public void setPwd(String pwd){
		this.pwd.set(pwd);
	}
	public StringProperty PwdProperty(){
		return pwd;
	}
	
	
}
