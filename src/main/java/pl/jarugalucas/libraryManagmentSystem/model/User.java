package pl.jarugalucas.libraryManagmentSystem.model;

import javax.persistence.*;

//this is POJO

@Entity
public class User {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id; // klucz główny (primary key)
	
	private String firstName;
	private String lastName;
	private Integer mobile;
	private String address;
	
	public User(Integer id, String firstName, String lastName, Integer mobile, String address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}