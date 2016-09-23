package io.egen.persistence;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	
	@Column(unique = true)
	private String email;
	
//	@OneToOne
//	private Address address;
	
//	@OneToMany
//	private List<Address> addresses;
	
	@ManyToOne
	private Address officeAddress;
	
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	public User(){
		id = UUID.randomUUID().toString();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
//				+ ", address=" + address + "]";
//	}
	
	

}
