package pl.jarugalucas.libraryManagmentSystem.model;

public class User {
	private Integer id;
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
}