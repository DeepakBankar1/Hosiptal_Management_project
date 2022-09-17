package com.hospital.project.entiries;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="staff_table")
public class Staff {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int staff_id;
	@Column
	String staff_name;
	@Column
	String user_email;
	@Column
	byte [] picture;
	@Column
	String staff_contact;
	@Column
	String staff_gender;
	@Column
	String password;
	@Column
	Date staff_bdate;
	@Column
	Date staff_jdate;
	@OneToOne
	@JoinColumn(name="login_id")
	Login login;	
	
	/*@JsonIgnoreProperties("staff")
	@ManyToOne
	@JoinColumn(name="dept_id")
	Department department;	*/
	
	/*@JsonIgnoreProperties("staff")
	@OneToMany(mappedBy="staff",cascade = CascadeType.ALL)
	Set<Admission> admission =new HashSet();*/
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Staff(int staff_id, String staff_name, String user_email, byte[] picture, String staff_contact,
			String staff_gender, String password, Date staff_bdate, Date staff_jdate, Login login) {
		super();
		this.staff_id = staff_id;
		this.staff_name = staff_name;
		this.user_email = user_email;
		this.picture = picture;
		this.staff_contact = staff_contact;
		this.staff_gender = staff_gender;
		this.password = password;
		this.staff_bdate = staff_bdate;
		this.staff_jdate = staff_jdate;
		this.login = login;
	}

	public Staff( String staff_name, String staff_email, String staff_contact, String staff_gender,
			String staff_password, Date staff_bdate, Date staff_jdate, Login login) {
		super();
		
		this.staff_name = staff_name;
		this.user_email = staff_email;
		this.staff_contact = staff_contact;
		this.staff_gender = staff_gender;
		this.password = staff_password;
		this.staff_bdate = staff_bdate;
		this.staff_jdate = staff_jdate;
		this.login = login;		
	}
	public Date getStaff_bdate() {
		return staff_bdate;
	}
	public void setStaff_bdate(Date staff_bdate) {
		this.staff_bdate = staff_bdate;
	}
	public Date getStaff_jdate() {
		return staff_jdate;
	}
	public void setStaff_jdate(Date staff_jdate) {
		this.staff_jdate = staff_jdate;
	}
	public Login getLogin() {
		return login;
		}

	public void setLogin(Login login) {
		this.login = login;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	
	public String getStaff_contact() {
		return staff_contact;
	}
	public void setStaff_contact(String staff_contact) {
		this.staff_contact = staff_contact;
	}
	public String getStaff_gender() {
		return staff_gender;
	}
	public void setStaff_gender(String staff_gender) {
		this.staff_gender = staff_gender;
	}
	@Override
	public String toString() {
		return "Staff [staff_id=" + staff_id + ", staff_name=" + staff_name + ", staff_email=" + user_email
				+ ", staff_contact=" + staff_contact + ", staff_gender=" + staff_gender + ", staff_password="
				+ password + ", staff_bdate=" + staff_bdate + ", staff_jdate=" + staff_jdate + ", login=" + login
				+  "]";
	}
	
	

}
