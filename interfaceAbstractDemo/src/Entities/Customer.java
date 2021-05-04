package Entities;

import Abstract.IEntitiy;

public class Customer implements IEntitiy{
	public int id;
	public String firstName;
	public String LastName;
	public String natioanltyId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getNatioanltyId() {
		return natioanltyId;
	}
	public void setNatioanltyId(String natioanltyId) {
		this.natioanltyId = natioanltyId;
	}
	
}
