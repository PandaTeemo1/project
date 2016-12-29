package sample7;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Dept {
	private SimpleIntegerProperty idProperty = new SimpleIntegerProperty(0);
	private SimpleStringProperty nameProperty = new SimpleStringProperty();
	
	public Integer getId(){
		return idProperty.get();
	}
	public void setId(Integer id){
		this.idProperty.set(id);
	}
	public SimpleIntegerProperty idProperty(){
		return idProperty;
	}
	
	public String getName(){
		return nameProperty.get();
	}
	public void setName(String name){
		this.nameProperty.set(name);
	}
	public SimpleStringProperty nameProperty(){
		return nameProperty;
	}
	

}
