package in.bushansirgur.springboot.crudapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee")
public class Employee {

	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String firstname;
	private String lastname;
	private String password;
	private String cin;
	private String nompère;
	private String nommère;
	private String datedenaissance;
	private String sexe;
	
	
	
	public String getSexe() {
		return sexe;
	}



	public void setSexe(String sexe) {
		this.sexe = sexe;
	}



	public Employee(Integer id, String username, String firstname, String lastname, String password, String cin,
			String nompère, String nommère, String datedenaissance, String sexe) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.cin = cin;
		this.nompère = nompère;
		this.nommère = nommère;
		this.datedenaissance = datedenaissance;
		this.sexe = sexe;
	}



	public Employee() {
		super();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	



	



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getCin() {
		return cin;
	}



	public void setCin(String cin) {
		this.cin = cin;
	}



	public String getNompère() {
		return nompère;
	}



	public void setNompère(String nompère) {
		this.nompère = nompère;
	}



	public String getNommère() {
		return nommère;
	}



	public void setNommère(String nommère) {
		this.nommère = nommère;
	}



	public String getDatedenaissance() {
		return datedenaissance;
	}



	public void setDatedenaissance(String datedenaissance) {
		this.datedenaissance = datedenaissance;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", password=" + password + ",nompère=" + nompère + ",cin=" + cin +",nommère=" + nommère + ",datedenaissance=" + datedenaissance + ",sexe=" + sexe +"]";
	}
	
	
	
	

}
